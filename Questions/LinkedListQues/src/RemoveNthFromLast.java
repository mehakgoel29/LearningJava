public class RemoveNthFromLast {
     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


        public ListNode removeNthFromEnd(ListNode head, int n) {
            int length=0;
            ListNode temp=head;
            while(temp!=null){
                length++;
                temp=temp.next;
            }
            temp=head;
            if (n == length) {
                return head.next;   //first node will be deleted so head.next will be considered as final list
            }
            for (int i = 1; i < length - n ; i++) {
                temp = temp.next;
            }
            temp.next=temp.next.next;
            return head;
        }


}
