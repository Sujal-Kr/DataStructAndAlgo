package Vit.OperatingSystem;
import java.util.concurrent.Semaphore;

class SharedBuffer {
    int[] buffer;
    int size;
    int in;
    int out;
    Semaphore empty;
    Semaphore full;
    Semaphore mutex;

    public SharedBuffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.in = 0;
        this.out = 0;
        this.empty = new Semaphore(size);
        this.full = new Semaphore(0);
        this.mutex = new Semaphore(1);
    }

    public void produce(int item) throws InterruptedException {
        empty.acquire();
        mutex.acquire();
        buffer[in] = item;
        in = (in + 1) % size;
        System.out.println("Produced: " + item);
        mutex.release();
        full.release();
    }

    public int consume() throws InterruptedException {
        full.acquire();
        mutex.acquire();
        int item = buffer[out];
        out = (out + 1) % size;
        System.out.println("Consumed: " + item);
        mutex.release();
        empty.release();
        return item;
    }
}

class Producer implements Runnable {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
                Thread.sleep(1000); // Simulate some work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                int item = buffer.consume();
                System.out.println(item);
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumer{
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(10);
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}
