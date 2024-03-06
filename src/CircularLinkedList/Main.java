package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addFirst("Osama");
        list.addFirst("Turki");
        list.addFirst("2");
        list.addFirst("3");
        list.addFirst("4");
        list.find("Osama");
        list.display();


    }
}
