package SinglyLinkedList;

public class SingLinkedList<E> {
    private Node<E> head = null;

    private static class Node<E> {
        private E element;

        private Node<E> next;
        public Node(E e , Node<E> n) {
            this.element = e;
            this.next = n;
        }

        // setters and getters
        public E getElement() {
            return this.element;
        }

        public Node<E> getNext() {
            return this.next;
        }

        public void setNext(Node<E> n) {
            this.next = n;
        }
    }
    private Node<E> tail = null;
    private int size = 0;

    public SingLinkedList() {}

    //Access Methods
    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        if(this.size == 0) {
            return true;
        }
        return false;
    }
    public E first() {
        if(this.isEmpty()) {
            return null;
        }
        return this.head.getElement();
    }

    public E last() {
        if(this.isEmpty()) {
            return null;
        }
        return this.tail.getElement();
    }

    public void display() {
        Node<E> current = this.head;
        while(current != null) {
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

    public void find(E e) {
        Node<E> current = this.head;
        int counter = 0;
        while(current != null) {
            if(current.getElement() == e) {
                System.out.println("Element Found");
                System.out.println("Index: " + counter);
                return;
            }
            counter++;
            current = current.getNext();
        }
        System.out.println("Element Not Found");

    }
    //Update Methods
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e, null);
        newNode.next = this.head;
        this.head = newNode;
        if(this.size == 0) {
            this.tail = this.head;
        }
        this.size++;
    }
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e, null);
        if(this.isEmpty()) {
            this.head = this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.size++;
    }

    public void addAtPosition(E e, int position) {
        if(position < 0 || position > this.size) {
            System.out.println("Invalid Position");
            return;
        }
        if(position == 1) {
            this.addFirst(e);
            return;
        }

//        if(position == this.size) {
//            this.addLast(e);
//            return;
//        }
        Node<E> newNode = new Node<>(e, null);
        Node<E> current = this.head;
        int counter = 1;
        while(counter < position - 1 && current.next != null) {
            current = current.next;
            counter++;
        }
        newNode.next = current.next;
        current.next = newNode;
        this.size++;
    }
    public E removeFirst() {
        if(this.isEmpty()) {
            System.out.println("List is Empty");
            return null;
        }
        head = head.next;
        System.out.println("First Element Removed");
        this.size--;
        if(this.size == 0) {
            this.tail = null;
        }
        return head.getElement();
    }

}