public class Myqueue extends Node {

    private Node head;
    private Node tail;

    Myqueue(){
        this.head = null;
        this.tail = null;
    }


    public void insertAtLast(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
        }

        tail.next = node;
        tail = tail.next;
    }

    public void removeFromFirst(){
        if (head == null){
            System.out.println("Queue is empty.");
            return;
        }

        head = head.next;

    }

    public void Display() {
        Node temp = this.head;
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
