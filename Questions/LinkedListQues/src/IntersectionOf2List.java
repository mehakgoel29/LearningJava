import java.util.ArrayList;

public class IntersectionOf2List {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        // Step 1: Store all nodes of list A in an ArrayList
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = headA;
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        // Step 2: Traverse list B and check if any node exists in the list
        temp = headB;
        while (temp != null) {
            if (list.contains(temp)) { // If the node is found in list, it's the intersection point
                return temp;
            }
            temp = temp.next;
        }

        return null; // No intersection found
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
