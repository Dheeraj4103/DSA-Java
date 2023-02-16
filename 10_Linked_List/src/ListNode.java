public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      public static void main(String[] args) {
            ListNode headA = new ListNode(1);
            insertAtLast(headA, 2);
            insertAtLast(headA, 3);
            insertAtLast(headA, 3);
            insertAtLast(headA, 4);
            insertAtLast(headA, 4);
            insertAtLast(headA, 5);
//            insertAtLast(headA, );
//            insertAtLast(headA, 9);

//            reverseAltKGroup(headA, 3);
//            reverseBetween(headA, 1, 3);
            deleteDuplicates(headA);
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

      public static ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null){
                  return head;
            }

            int length = 1;
            ListNode tail = head;
            while (tail.next != null){
                  length++;
                  tail = tail.next;
            }

            int diff = k % length;

            if (diff == 0){
                  return head;
            }
            ListNode temp = head;
            ListNode prev = null;
            for (int i = 0; i < length - diff; i++){
                  prev = temp;
                  temp = temp.next;
            }
            prev.next = null;
            tail.next = head;
            head = temp;
            return head;
      }

      public static ListNode reverseBetween(ListNode head, int left, int right) {
            if (head == null ||head.next == null){
                  return head;
            }

            ListNode current = head;
            boolean isHead = false;
            ListNode newHead = null;
            ListNode prev = null;

            for (int i = 0; i < left - 1; i++){
                  prev = current;
                  current = current.next;
            }
            if (current == head){
                  isHead = true;
                  prev = current;
            }
            newHead = current;

            for (int i = left; i < right; i++){
                  ListNode temp = current.next;
                  current.next = temp.next;
                  if (isHead){
                        temp.next = head;
                        head = temp;
                  } else {
                        temp.next = newHead;
                        newHead = temp;
                        prev.next = newHead;
                  }
            }

            return head;
      }

      public static ListNode reverseKGroup(ListNode head, int k) {
            if (k <= 1 || head == null){
                  return head;
            }
            ListNode curr = head;
            int left = 1;
            int right = left + k - 1;
            while (curr != null){
                  for (int i = left; i <= right; i++){
                       if (curr == null){
                             return head;
                       }
                       curr = curr.next;
                  }
                  head = reverseBetween(head, left, right);
                  left = right+1;
                  right = left + k - 1;
            }
            return head;
      }

      public static ListNode reverseAltKGroup(ListNode head, int k) {
            if (k <= 1 || head == null){
                  return head;
            }
            ListNode curr = head;
            int left = 1;
            int right = left + k - 1;
            boolean skip = false;
            while (curr != null){
                  for (int i = left; i <= right; i++){
                        if (curr == null){
                              return head;
                        }
                        curr = curr.next;
                  }
                  skip = skip ^ true;
                  if (skip) {
                        head = reverseBetween(head, left, right);
                  }
                  left = right+1;
                  right = left + k - 1;
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

            return null;
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
      static ListNode deleteDuplicates(ListNode head) {
            ListNode temp = head;
            ListNode prev = null;
            while (temp.next != null){

                  if (temp.next != null && temp.val == temp.next.val){
                        while (temp.val == temp.next.val){
                              temp = temp.next;
                        }
                        prev.next = temp.next;
                        temp = temp.next;
                  } else {
                        prev = temp;
                        temp = temp.next;
                  }
            }
            return head;
      }
  }