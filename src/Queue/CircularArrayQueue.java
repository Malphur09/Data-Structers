package Queue;
public class CircularArrayQueue {
    private int Queue[];
    int front = 0, rear = 0, size = 0, count = 0;

    public CircularArrayQueue(int maxSize) {
        Queue = new int[maxSize];
        this.size = maxSize;
    }

    public boolean isFull() {
        return (count == size);
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public int getFront() {
        return Queue[front];
    }
    public int getRear() {
        return Queue[rear - 1];
    }
    public int getSize() {
        return count;
    }

    public void EnQueue(int value) {
        if(isFull()) {
            System.out.println("Stack is Overflow");
            return;
        }
        Queue[rear] = value;
        rear = (rear + 1 ) % size;
        count++;
        System.out.println(value + " Added to the Queue");
    }
    public void DeQueue(){
        if(isEmpty()){
            System.out.println("Stack is Underflow");
            return;
        }
        System.out.println(Queue[front] + " Deleted from Queue");
        front = (front + 1 ) % size;
        count--;
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is underflow");
            return;
        }

        for(int i = front; i < rear; i++) {
            System.out.println(Queue[i]);
        }

    }
}
