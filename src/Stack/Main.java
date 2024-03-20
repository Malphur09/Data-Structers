package Stack;

public class Main {
    public static void main(String[] args) {
        StackArray s1 = new StackArray(20);
        s1.push(10);
        s1.peek(); //printing top element of the stack
        s1.push(20);
        s1.peek();
        s1.push(30);
        s1.peek();
        s1.push(40);
        s1.peek();

        StackLL s2 = new StackLL();
        s2.push(s1.top()); //pushing top element from stack array into LinkedList Stack
        s1.pop(); //popping from stack array
        s2.push(s1.top());
        s1.pop();
        s2.push(s1.top());
        s1.pop();
        s2.push(s1.top());
        s1.pop();

        System.out.println("Displaying LinkedList Stack");
        s2.display();
        System.out.println("Displaying Array Stack");
        s1.display();

    }
}