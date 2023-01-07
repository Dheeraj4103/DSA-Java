class MergeLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode list = head;
        list.next = new ListNode(2);
        list = list.next;
        list.next = new ListNode(1);
        list = list.next;
        list.next = new ListNode(3);

        sortList(head);

    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left, right);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode prevMid = null;

        while (head != null && head.next != null){
            prevMid = (prevMid == null) ? head : prevMid.next;
            head = head.next.next;
        }
        ListNode mid = prevMid.next;
        prevMid.next = null;
        return mid;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }

        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }
}