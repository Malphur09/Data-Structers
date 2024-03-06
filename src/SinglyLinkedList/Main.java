package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SingLinkedList<String> list = new SingLinkedList<>();
        list.addFirst("UoD");
        list.addFirst("Hello");
        list.addLast("World");
        System.out.println("Size: " + list.size());
        list.addAtPosition("At", 2);
        System.out.println(list.last());

    }
}
