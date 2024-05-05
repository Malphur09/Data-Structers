package Queue;

public class DoubleEndedQueue {
    private class Node {
        private int element;
        private Node next;
        private Node prev;

        public Node(int element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public int getElement() {
            return element;
        }

        public void setElement(int element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }
    Node front = null;
    Node rear = null;
    int count = 0;

    public int size() {
        return count;
    }
    public boolean isEmpty() {
        return (count == 0);
    }
    public String getFront() {
        if(isEmpty()) {
            return "Queue is Empty!";
        }
        return front.element + " ";
    }
    public String getRear() {
        if(isEmpty()){
            return "Queue is Empty!";
        }
        return rear.element + " ";
    }
    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        Node temp = front;
        while(temp != null) {
            System.out.println(temp.element);
            temp = temp.next;
        }
    }
    public void EnQueueRear(int value) {
        Node newNode = new Node(value, null, null);
        if(isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        count++;
    }
    public void EnQueueFront(int value) {
        Node newNode = new Node(value, null, null);
        if(isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        count++;
    }
    public void DeQueueFront() {
        if(isEmpty()) {
            System.out.println("Queue is underflow");
            return;
        }
        System.out.println(front.element + " Deleted from Queue");
        if (count == 1) {
            front = rear = null;
            count = 0;
            return;
        }
        front = front.next;
        front.prev = null;
        count--;
    }
    public void DeQueueRear() {
        if(isEmpty()) {
            System.out.println("Queue is underflow");
            return;
        }
        System.out.println(rear.element + " Deleted from Queue");
        if (count == 1) {
            front = rear = null;
            count = 0;
            return;
        }
        rear = rear.prev;
        rear.next = null;
        count--;
    }
}
