public class Main {
    public static void main(String[] args) {
        Myqueue myqueue = new Myqueue();
        myqueue.insertAtLast(1);
        myqueue.insertAtLast(2);

        myqueue.Display();
        myqueue.removeFromFirst();
        myqueue.Display();
    }
}
