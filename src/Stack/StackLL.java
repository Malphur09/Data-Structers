package Stack;

public class StackLL {
    private static class Node {
        private int element;
        private Node next = null;
        public Node(int e , Node n) {
            this.element = e;
            this.next = n;
        }
        public int getElement() {
            return this.element;
        }
        public Node getLink() {
            return this.next;
        }
        public void setLink(Node n) {
            this.next = n;
        }
    }
    private Node top = null;
    private int size = 0;

    public StackLL() {};

    public boolean isEmpty() {
        return this.size == 0;
    }

    //prints the top element of the stack
    public  void top() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("\n---Top of the stack---");
        System.out.println("Top element: " + this.top.getElement());
    }
    public void display() {
        System.out.println("----> Displaying Stack <---");
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.println("Stack elements are: ");
        while (temp != null) {
            System.out.println(temp.getElement() + "  ");
            temp = temp.getLink();
        }
    }
    public void push(int value) {
        System.out.println("----> Pushing into stack <----");
        Node newNode = new Node(value, null);
        newNode.setLink(top);
        top = newNode;
        size++;
        System.out.println("Element " + value + " is pushed into stack");
    }
    public void pop() {
        System.out.println("----> Popping from stack <----");
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Popped element: " + top.getElement());
        top = top.next;
        size--;
    }

}

