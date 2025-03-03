public class DeleteMiddle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp = null; // To keep track of the node before `slow`

        if (head == null || head.next == null) return null;

        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;

        }

        if (temp != null) {
            temp.next = slow.next;
        }

        return head;
    }



}
