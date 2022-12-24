public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtLast(5);
        list.insert(10, 3);
        list.delete(2);
    }
}
