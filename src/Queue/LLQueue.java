package Queue;
public class LLQueue {
    private class Node {
        private int element;
        private Node link;
        public Node(int value, Node n) {
            this.element = value;
            this.link = n;
        }
        public void setLink(Node n) {
            this.link = n;
        }
        public void setElement(int value) {
            this.element = value;
        }

        public int getElement() {
            return element;
        }

        public Node getLink() {
            return link;
        }
    }

    private int count = 0;
    Node front = null;
    Node rear = null;

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public String getFront() {
        if(isEmpty()) {
            return "Queue is Empty";
        }
        return front.element + " ";
    }

    public String getRear() {
        if(isEmpty()) {
            return "Queue is Empty";
        }
        return rear.element + " ";
    }

    public void EnQueue(int value) {
        Node newNode = new Node(value,null);
        if(isEmpty()) {
            front = rear = newNode;
        } else {
            rear.link = newNode;
            rear = newNode;
        }
        count++;
    }
    public void DeQueue() {
        if(isEmpty()) {
            System.out.println("Queue is underflow");
            return;
        }
        System.out.println(front.element + " Deleted from Queue");
        front = front.link;
        count--;
    }
    // complete the display method
    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is underflow");
            return;
        }
        Node temp = front;
        while(temp != null) {
            System.out.println(temp.element);
            temp = temp.link;
        }
    }
}
