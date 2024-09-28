public class ReverseInGroupsDoubly {
    Node head;

    // Function to insert a node at the front of the doubly linked list
    void insert(int newData) {
        Node node = new Node(newData);
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    // Function to reverse the doubly linked list in groups of size k
    Node reverseInGroups(Node head, int k) {
        if (head == null) return null;

        Node currentNode = head;
        Node prevNode = null;
        Node nextNode = null;
        int count = 0;

        // Reverse first k nodes of the list
        while (currentNode != null && count < k) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            currentNode.prev = nextNode;
            prevNode = currentNode;
            currentNode = nextNode;
            count++;
        }

        // nextNode is now the (k+1)th node, recursively call for the rest of the list
        if (nextNode != null) {
            head.next = reverseInGroups(nextNode, k);
            if (head.next != null) {
                head.next.prev = head;
            }
        }

        return prevNode;
    }

    // Function to print the doubly linked list
    void display(Node node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseInGroupsDoubly dll = new ReverseInGroupsDoubly();

        // Create a doubly linked list: 10<->8<->4<->2
        dll.insert(2);
        dll.insert(4);
        dll.insert(8);
        dll.insert(10);

        System.out.println("Original list:");
        dll.display(dll.head);

        int k = 2;
        dll.head = dll.reverseInGroups(dll.head, k);

        System.out.println("Reversed list in groups of " + k + ":");
        dll.display(dll.head);
    }
    class Node {
        int val;
        Node prev;
        Node next;

        Node(int data) {
            this.val = data;
            this.prev = null;
            this.next = null;
        }
    }
}
