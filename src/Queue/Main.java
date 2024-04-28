package Queue;

public class Main {
    public static void main(String[] args) {
//        ArrayQueue queueArray = new ArrayQueue(5);
//        queueArray.EnQueue(10);
//        queueArray.EnQueue(20);
//        queueArray.EnQueue(30);
//        queueArray.EnQueue(40);
//        queueArray.EnQueue(50);
//        System.out.println("Size of queue : "  + queueArray.getSize());
//        queueArray.getFront();
//        queueArray.getRear();
//        queueArray.DeQueue();
//        queueArray.DeQueue();
//        queueArray.DeQueue();
//        queueArray.EnQueue(60);

        CircularArrayQueue Q = new CircularArrayQueue(5);
        Q.EnQueue(10);
        Q.EnQueue(20);
        Q.EnQueue(30);
        Q.EnQueue(40);
        Q.EnQueue(50);
        System.out.println("Size of queue : " + Q.getSize());
        System.out.println("Front of queue : " + Q.getFront());
        System.out.println("Rear of queue : " + Q.getRear());


    }
}
