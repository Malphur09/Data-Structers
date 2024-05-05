package LabQuiz2_Queues;
public class QueueLab {

    int front = 0, rear = 0, size = 0, count = 0;
    private int Queue[];

    QueueLab(int maxSize) {
        Queue = new int[maxSize];
        this.size = maxSize;
    }
    public boolean isEmpty() {return count == 0;}
    public boolean isFull()
    {
        return count == size;
    }
    public void EnQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Overflow");
            return;
        }
        Queue[rear] = value;
        rear = (rear + 1) %size;
        count++;
        //System.out.println(value + "- Added to Queue.");
    }


    public int DeQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Underflow");
            return -1;
        }
        int temp=Queue[front];
        front = (front + 1)%size;
        count--;
        //System.out.println(temp + "- Deleted from Queue");
        return temp;

    }

    public void printOdd()
    {
        System.out.println("---- Odd Numbers------ ");
        for(int i = 0; i < count; i++) {
            int index = (front + i) % size;
            if(Queue[index] % 2 != 0) {
                System.out.println(Queue[index]);
            }
        }
    }

    public void printEven()
    {
        System.out.println("---- Even Numbers------ ");
        for(int i = 0; i < count; i++) {
            int index = (front + i) % size;
            if (Queue[index] % 2 == 0) {
                System.out.println(Queue[index]);

            }
        }
    }
    public static void main(String[] args) {
        QueueLab q = new QueueLab(10);
        q.EnQueue(1);
        q.EnQueue(2);
        q.EnQueue(3);
        q.EnQueue(4);
        q.EnQueue(5);
        q.EnQueue(6);
        q.EnQueue(7);
        q.EnQueue(8);
        q.EnQueue(9);
        q.EnQueue(10);
        q.printEven();
        q.printOdd();

    }

}

