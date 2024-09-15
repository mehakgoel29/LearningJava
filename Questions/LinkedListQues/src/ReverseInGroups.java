public class ReverseInGroups {
    static Node head;

    // Method to reverse nodes in groups of k
    public static Node reverse(Node head, int k) {
        Node curr = head;
        Node prev = null;
        Node next = null;

        int count = 0;

        // Reverse first k nodes of the linked list
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // Recursively reverse the remaining nodes if any
        if (next != null) {
            head.next = reverse(next, k);  // Attach the reversed groups
        }

        // Return prev as the new head of this reversed group
        return prev;
    }

    // Method to display the linked list
    public static void display(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        head = new Node(1);  // Use the static head
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);


        int k = 4;
         display(head);
        // Reverse nodes in groups of k and update head
        head = reverse(head, k);  // Pass both head and k, and update head with the result
        display(head);  // Display the reversed list
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
