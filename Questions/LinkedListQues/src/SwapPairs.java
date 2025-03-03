public class SwapPairs {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Method to swap adjacent pairs by modifying values (not pointers)
    public static ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            // Swap values of adjacent nodes
            int var = temp.val;
            temp.val = temp.next.val;
            temp.next.val = var;

            // Move temp by two nodes to process the next pair
            temp = temp.next.next;
        }
        return head;
    }

    public ListNode swapPairsDummy(ListNode head) {
        if (head == null || head.next == null) return head; // Edge case

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        while (temp.next != null && temp.next.next != null) {
            ListNode first = temp.next;
            ListNode second = temp.next.next;

            // Swapping the pair
            temp.next = second;
            first.next = second.next; // Keep list connected
            second.next = first;


            // Move temp to the next pair
            temp = first;
        }

        return dummy.next;
    }
    // Helper method to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating linked list: 2 -> 3 -> 4 -> 4
        ListNode head = new ListNode(2);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(4);

        System.out.println("Original List:");
        printList(head);

        // Swap adjacent pairs
        head = swapPairs(head);

        System.out.println("Swapped List:");
        printList(head);

        System.out.println("Original List:");
        printList(head);

        // Swap adjacent pairs
        head = swapPairs(head);

        System.out.println("Swapped List:");
        printList(head);
    }
}
