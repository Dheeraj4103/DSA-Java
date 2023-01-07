public class LinkedListCycle {
    public static void main(String[] args) {


        ListNode head = new ListNode(3);
        ListNode list = head;
        list.next = new ListNode(2);
        ListNode cycle = list.next;
        list = list.next;
        list.next = new ListNode(0);
        list = list.next;
        list.next = new ListNode(-4);
        list = list.next;
        list.next = cycle;

        System.out.println(detectCycle(head).val);
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while (f != null && f.next != null){
            f = f.next.next;
            s = s.next;

            if (f == s){
                int length = 0;
                do {
                    length++;
                    s = s.next;
                } while (f != s);

                f = head;
                s = head;
                for (int i = 0; i < length; i++){
                    s = s.next;
                }

                while (f != s){
                    f = f.next;
                    s = s.next;
                }
                return f;
            }
        }

        return null;
    }
}


