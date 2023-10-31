package Practice;
public class CircularQueue {
    private int[] queue;
    private int front; // Index of the front element
    private int rear;  // Index of the rear element
    private int size;  // Maximum size of the queue

    public CircularQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = this.rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == size - 1) || (rear == front - 1);
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % size;
            }
            queue[rear] = item;
            System.out.println("Enqueued: " + item);
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int item = queue[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            System.out.println("Dequeued: " + item);
            return item;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int current = front;
        while (true) {
            System.out.print(queue[current] + " ");
            if (current == rear) {
                break;
            }
            current = (current + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        cq.display();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.display();
        // cq.enqueue(6);
        // cq.enqueue(7);
        cq.display();
    }
}
