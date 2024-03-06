package CircularLinkedList;

public class CircularLinkedList<E> {
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
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //Update Methods
    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        if(this.size == 0) {
            return true;
        }
        return false;
    }
    public void display() {
        Node<E> current = this.head;
        do {
            System.out.println(current.getElement());
            current = current.next;
        } while(current != this.head);
        System.out.println("");
    }
    public void find(E Value) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        boolean flag = false;
        Node<E> current = this.head;
        int counter = 1;
        do{
            if(current.getElement() == Value) {
                System.out.println("Element found at position: " + counter);
                flag = true;
                break;
            }
            current = current.next;
            counter++;
        } while(current != this.head);

        if(flag) {
            System.out.println(Value + " Element Found at index : " + counter );
        }
        else {
            System.out.println("Element not found");
        }
    }

    //Access Methods
    public void removeFirst() {
        if(this.head == null) {
            System.out.println("List is empty");
            return;
        }
        this.head = head.next;
        this.tail.next = head;
        this.size--;
        System.out.println("First element removed");
        if (size == 0) {
            this.head = null;
            this.tail = null;
        }
    }
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e, null);
        newNode.next = this.head;
        head = newNode;
        if (size == 0 ) {
            this.tail = this.head;
        }
        tail.next = head;
        this.size++;
    }
}