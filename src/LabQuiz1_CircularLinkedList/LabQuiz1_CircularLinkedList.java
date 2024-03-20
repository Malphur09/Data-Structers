package LabQuiz1_CircularLinkedList;

public class LabQuiz1_CircularLinkedList{

    private class Node {

        int data;
        Node next;
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }
    Node head = null;
    Node tail = null;
    int size = 0;

    public LabQuiz1_CircularLinkedList() {
    }

    //Access Methods
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Empty List..");
            return;
        }
        Node current = head;
        int i = 1;
        do {
            System.out.println("Node " + (i++) + ": " + current.getData());
            current = current.getNext();
        } while (current != head);
    }

    // This Method to add two integer nodes, the first value at the head and the second value at the tail
    public void AddNode(int value1,int value2)
    {
        Node newNode = new Node(value1, null);
        if (isEmpty()) {
            head = newNode;
            tail = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
        Node newNode2 = new Node(value2, null);
        tail.next = newNode2;
        tail = newNode2;
        tail.next = head;
        size++;
    }

    //This method to be implement using the recursion technique.
    public int length(Node current)
    {
        if (current == null) {
            return 0;
        }
        if (current.next == head) {
            return 1;
        }
        return 1 + length(current.next);
    }
    public void addFirst(int value)
    {
        Node newNode = new Node(value, null);
        newNode.next = head;
        head = newNode;
        if (isEmpty()) {
            tail = head;
        }
        tail.next = head;

        size++;
    }

    public static void main(String[] args) {
        LabQuiz1_CircularLinkedList list = new LabQuiz1_CircularLinkedList();

        list.AddNode(1,2);
        list.AddNode(3,4);
        list.AddNode(5,6);
        list.display();
        System.out.println("LinkedList size by size method = " + list.size());
        System.out.println("LinkedList size by length method = " + list.length(list.head));

    }

}
