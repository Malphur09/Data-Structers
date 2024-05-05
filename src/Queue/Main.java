package Queue;

public class Main {
    public static void main(String[] args) {
        DoubleEndedQueue queue = new DoubleEndedQueue();
        queue.EnQueueFront(10);
        queue.EnQueueFront(20);
        queue.EnQueueFront(30);
        queue.EnQueueFront(40);
        queue.EnQueueFront(50);
        queue.DeQueueFront();
        queue.DeQueueRear();


        System.out.println("Front: " + queue.getFront());
        System.out.println("Rear: " + queue.getRear());

    }
}
