public class LoopDetection {

    public static Boolean LoopDetection(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                System.out.println("Loop Detected");
                return true;
            }
        }
        System.out.println("No loop detected");
        return false;
    }

    public static Node startingPoint(Node head) {
        Node slow = head;
        Node fast = head;

        boolean hasLoop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }

        if (!hasLoop) {
            System.out.println("No loop to find starting point.");
            return -1;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println("Loop starts at node with value: " + slow.value);
        return slow;
    }

    public void removeLoop(Node head) {
        Node start = startingPoint(head);
        if (start == null) return; // No loop found

        Node temp = start;
        while (temp.next != start) {
            temp = temp.next;
        }

        // Break the loop
        temp.next = null;
    }

    public static void main(String[] args) {
        // Use local head
        Node head = new Node(50);
        head.next = new Node(20);
        head.next.next = new Node(15);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;  // Creates loop starting at 15

        if (LoopDetection(head)) {
            startingPoint(head);
        }
    }

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
