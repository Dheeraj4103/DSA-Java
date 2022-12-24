public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(){
        this.size = 0;
    }

    public void insertAtFirst(int value){
        Node node = new Node(value);
        if (this.head == null){
            this.head = node;
            this.tail = node;
            Display();
            this.size++;
            return;
        }

        node.next = this.head;
        this.head.prev = node;
        this.head = node;
        Display();
        this.size++;
    }

    public void insertAtLast(int value){
        Node node = new Node(value);
        Node last = this.head;
        if (last == null){
            this.head = node;
            this.tail = node;
            return;
        }
        while (last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        this.tail = node;
        this.size++;
        Display();
    }

    public Node find(int index){
        if (this.head == null){
            return null;
        }
        Node temp = this.head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void insert(int value, int index){
        Node node = new Node(value);
        Node prev = find(index-1);
        if (prev == null){
            return;
        }
        if (prev.equals(head)){
            insertAtFirst(value);
            return;
        }
        if (prev.next == null){
            insertAtLast(value);
            return;
        }
        node.next = prev.next;
        prev.next.prev = node;
        node.prev = prev;
        prev.next = node;
        Display();
    }

    public void delete(int index){
        Node node = find(index);
        if (node.equals(this.head)){
            this.head = node.next;
            Display();
            return;
        }

        if (node.next == null){
            node.prev.next = null;
            this.tail = node.prev;
            Display();
            return;
        }



        node.prev.next = node.next;
        node.prev = null;
        Display();
        this.size--;
    }

    public void Display(){
        getHead();
        getTail();
        Node temp = this.head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL\n");

    }
    public void getHead(){
        if (this.head != null)
            System.out.println("Head -> " + this.head.value);
    }
    public void getTail() {
        if (this.tail != null)
            System.out.println("Tail -> " + this.tail.value);
    }

    public void DisplayRev(){
        getHead();
        getTail();
        Node temp = this.tail;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println("NULL\n");
    }
}
