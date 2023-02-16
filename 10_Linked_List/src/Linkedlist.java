public class Linkedlist {
    private Node head = null;
    private Node tail = null;

    private int size;

    public Linkedlist(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertAtFront(int value){
        Node temp = new Node(value);
        temp.next = head;
        this.head = temp;

        if (this.tail == null){
            this.tail = temp;
        }
        this.size++;
        Display();
    }

    public void insertAtLast(int value){
        Node node = new Node(value);
        this.tail.next = node;
        this.tail = node;

        if (this.head == null){
            this.head = node;
        }

        this.size++;
    }

    public void insertRec(int value, int index){
        this.head = insertRec(value, index, this.head);
        Display();
        return;
    }

    private Node insertRec(int value, int index, Node curr_node){
        if (index == 0){
            Node node = new Node(value);
            node.next = curr_node;
            this.size++;
            return node;
        }

        curr_node.next = insertRec(value, index - 1, curr_node.next);
        return curr_node;
    }

    public void deleteDuplicate(){
        Node list = new Node(head.value);
        Node tail = list;
        Node temp = head.next;

        while (temp != null){
            if (tail.value != temp.value){
                tail.next = temp;
                tail = tail.next;
            }
            temp = temp.next;
        }
        tail.next = null;
        tail = list;
        while (tail != null){
            System.out.print(tail.value + " -> ");
            tail = tail.next;
        }
        System.out.println("END\n");
    }

    public void insert(int value, int index){
        if (index == 0){
            insertAtFront(value);
            return;
        }
        if (index == this.size){
            insertAtLast(value);
            return;
        }

        Node temp = this.head;
        for (int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
    }

    public void delete(int index){
        if (this.size == 0 || index > this.size-1){
            System.out.println("Please Enter valid index.");
            return;
        }
        if (index == 0){
            this.head = this.head.next;
            return;
        }
        Node temp = this.head;
        Node prev = null;
        for (int i = 0; i < index; i++){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        if (this.tail.equals(temp)){
            this.tail = prev;
        }
        this.size--;
    }

    public Node find(int value){
        Node node = this.head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void Display(){
        Node temp = this.head;
        while (temp != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public void getHead(){
        System.out.println("Head -> "+this.head.value);
    }
    public void getTail() {
        System.out.println("Tail -> "+this.tail.value);
    }
}