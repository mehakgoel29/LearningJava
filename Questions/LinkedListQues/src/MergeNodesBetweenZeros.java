public class MergeNodesBetweenZeros {
        public ListNode mergeNodes(ListNode head) {
            ListNode dummy = new ListNode();
            ListNode curr = dummy;
            ListNode temp = head.next; // Start from the first non-zero node and skip first zero
            int sum = 0;

            while (temp != null) {
                if (temp.val == 0) {
                    curr.next = new ListNode(sum);
                    curr = curr.next;
                    sum = 0;
                } else {
                    sum += temp.val;
                }
                temp = temp.next;
            }

            return dummy.next; //beacuse dummy is empty and actual list starts from the dummy.next;
        }
       public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
