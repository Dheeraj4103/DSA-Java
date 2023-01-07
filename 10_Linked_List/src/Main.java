public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insertAtFront(3);
        list.insertAtFront(3);
        list.insertAtFront(2);
        list.insertAtFront(2);
        list.insertAtFront(1);
        list.deleteDuplicate();
    }
}
