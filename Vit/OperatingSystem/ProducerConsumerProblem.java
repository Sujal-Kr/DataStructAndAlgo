package Vit.OperatingSystem;
import java.util.concurrent.Semaphore;

class SharedResource {
    private int data;
    private Semaphore semaphoreProducer;
    private Semaphore semaphoreConsumer;

    public SharedResource() {
        data = 0;
        semaphoreProducer = new Semaphore(1); // Semaphore for the producer
        semaphoreConsumer = new Semaphore(0); // Semaphore for the consumer
    }

    public void produce() throws InterruptedException {
        semaphoreProducer.acquire();
        // Producing some data
        data++;
        System.out.println("Produced: " + data);
        semaphoreConsumer.release();
    }

    public void consume() throws InterruptedException {
        semaphoreConsumer.acquire();
        // Consuming the data
        System.out.println("Consumed: " + data);
        semaphoreProducer.release();
    }
}

class Producer implements Runnable {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            while (true) {
                sharedResource.produce();
                Thread.sleep(1000); // Simulating some production time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            while (true) {
                sharedResource.consume();
                Thread.sleep(1500); // Simulating some consumption time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerProblem  {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(new Producer(sharedResource));
        Thread consumerThread = new Thread(new Consumer(sharedResource));

        producerThread.start();
        consumerThread.start();
    }
}
