package Stack;

public class Main {
    public static void main(String[] args) {
//        Stack.StackArray stack = new Stack.StackArray(5);
//        stack.push(10);
//        stack.push(20);
//        stack.push(50);
//        stack.push(60);
//        stack.push(70);
//        stack.display();
//        stack.makeEmpty();
//        stack.display();

        StackLL stack = new StackLL();
        stack.push(10);
        stack.push(20);
        stack.push(50);
        stack.push(60);
        stack.pop();
        stack.display();

    }
}