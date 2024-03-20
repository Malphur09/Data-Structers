package Stack;

public class StackArray {
    int top;
    int[] stack;
    int capacity;

    public StackArray(int size) {
        stack = new int[size];
        top = -1;
        capacity = size;
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == capacity - 1);
    }
    public int size() {
        return top + 1;
    }
    //top returns the top element of the stack
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is underflow");
            return -1;
        }
        return stack[top];
    }
    public void display() {
        System.out.println("----Displaying Stack----");

        if (isEmpty()) {
            System.out.println("Stack is underflow");
            return;
        }
        for (int k = top; k >= 0; k--) {
            System.out.println(stack[k]);
        }
        System.out.println();
    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return;
        }
        top = top + 1;
        stack[top] = value;
        System.out.println("Pushed " + value + " to stack");
    }
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return;
        }
        int temp = stack[top];
        top = top - 1;
        System.out.println("Popped " + temp + " from StackArray");
    }
    //prints the top element of the stack
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is underflow");
            return;
        }
        System.out.println("Top element is " + stack[top]);
    }
    public void makeEmpty() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("----Making stack empty----");
        for(int k = top; k >= 0; k--) {
            pop();
        }
        top = -1;
    }
}
