package DoublyLinkedList;

public class DoubleCircularLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> prev;

        public Node(E e , Node<E> n , Node<E> prev) {
            this.element = e;
            this.next = n;
            this.prev = prev;
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
        public Node<E> getPrev() {
            return this.prev;
        }
        public void setPrev(Node<E> p) {
            this.prev = p;
        }
    }
    int size = 0;
    private Node<E> head;
    private Node<E> tail;
    public DoubleCircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    //Access methods
    public boolean isEmpty() {
        if(this.size == 0) {
            return true;
        }
        return false;
    }

    public void displayBackward() {
        if(isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Displaying the list backward :");
        Node<E> current = this.tail;
        do {
            System.out.println(current.getElement());
            current = current.prev;
        } while(current != this.tail);
        System.out.println("");
    }
    public void displayForward() {
        if(isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Displaying the list forward :");
        Node<E> current = this.head;
        do {
            System.out.println(current.getElement());
            current = current.next;
        } while(current != this.head);
        System.out.println("");
    }


    //Update Methods
    public void addLast(E e) {
        Node<E> newNode = new Node<E> (e, null, null);
        if(size == 0) {
            tail = head = newNode;
        }
        newNode.next = head;
        newNode.prev = tail;
        head.prev = newNode;
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    public void addFirst(E e) {
        Node<E> newNode = new Node<E> (e, null, null);
        if(size == 0) {
            tail = head = newNode;
        }
        newNode.next = head;
        newNode.prev = tail;
        head.prev = newNode;
        tail.next = newNode;
        head = newNode;
        size++;
    }

}