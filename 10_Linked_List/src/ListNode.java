public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      public static void main(String[] args) {
            ListNode headA = new ListNode(5);
            insertAtLast(headA, 6);
            insertAtLast(headA, 1);
            insertAtLast(headA, 8);
            insertAtLast(headA, 4);
            insertAtLast(headA, 5);

            ListNode headB = new ListNode(4);
            insertAtLast(headB, 1);
            insertAtLast(headB, 8);
            insertAtLast(headB, 4);
            insertAtLast(headB, 5);

            getIntersectionNode(headA, headB);
      }

      static void insertAtLast(ListNode head, int val){
            ListNode node = new ListNode(val);
            ListNode tail = head;
            while (tail.next != null){
                  tail = tail.next;
            }

            tail.next = node;

      }

      static ListNode ReverseList(ListNode list){
            ListNode head = list;
            while (list.next != null){
                  ListNode temp = list.next;
                  list.next = temp.next;
                  temp.next = head;
                  head = temp;
            }

            return head;
      }

      public static ListNode reverseBetween(ListNode head, int left, int right) {
            if (head == null ||head.next == null){
                  return head;
            }

            ListNode current = head;
            ListNode newHead = null;
            ListNode prev = null;

            for (int i = 0; i < left - 1; i++){
                  prev = current;
                  current = current.next;
            }
            newHead = prev;
            prev = current;
            for (int i = left; i < right; i++){
                  ListNode temp = current.next;
                  current.next = temp.next;
                  temp.next = prev;
                  if (current == head){
                        head = temp;
                  }
                  else{
                        newHead.next = temp;
                  }
                  prev = temp;
            }

            return head;
      }

      public static boolean isPalindrome(ListNode head) {
            ListNode prevMid = null;
            ListNode list = head;
            while (list != null && list.next != null){
                  prevMid = (prevMid == null) ? head : prevMid.next;
                  list = list.next.next;
            }

            ListNode mid = prevMid.next;
            prevMid.next = null;
            mid = ReverseList(mid);
            while (head != null){
                  if (head.val != mid.val){
                        return false;
                  }
                  head = head.next;
                  mid = mid.next;
            }
            return true;
      }

      public static void reorderList(ListNode head) {
            ListNode list = head;
            helper(list.next, list, list);

      }

      static ListNode helper(ListNode current, ListNode prev, ListNode st){
            if (current == null){
                  return st;
            }
            st = helper(current.next, prev.next, st);
            if (current == st || st == null || st.next == null){
                  return null;
            }
            current.next = st.next;
            st.next = current;
            st = current.next;
            prev.next = null;
            return st;
      }

      public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode a = headA;
            ListNode b = headB;


      }

      public static ListNode helper1(ListNode a, ListNode b, ListNode ans){
            if (a.next == null && b.next == null){
                  return (a.val == b.val ? a : null);
            }

            a = (a.next == null ? a : a.next);
            b = (b.next == null ? b : b.next);
            ans = helper1(a, b, ans);
            if (a.val == b.val){
                  ans = a;
            }
            return ans;
      }

  }