package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleCircularLinkedList list = new DoubleCircularLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.removeFirst();
        list.displayForward();
    }
}
