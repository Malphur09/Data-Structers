package Queue;

public class ArrayQueue {
    private int front = 0; int rear = 0; int size = 0; int count = 0;
    private int Queue[];

    public ArrayQueue(int maxSize) {
        Queue = new int[maxSize];
        this.size = maxSize;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == size);
    }
    public void EnQueue(int value) {
        if(isFull()) {
            System.out.println("Queue is Overflow");
            return;
        }
        Queue[rear] = value;
        rear++;
        count++;
        System.out.println(value + " Added to Queue");
    }

    public void DeQueue() {
        if(isEmpty()) {
            System.out.println("Queue is Underflow");
            return;
        }
        front++;
        count--;
        System.out.println(Queue[front-1] + " - Deleted from Queue");
    }
    public void getFront() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element is " + Queue[front]);
    }
    public void getRear() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Rear element is " + Queue[rear - 1]);
    }
    public int getSize(){
        return count;
    }

    public void display(){
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.println(Queue[i]);
        }
    }

}
