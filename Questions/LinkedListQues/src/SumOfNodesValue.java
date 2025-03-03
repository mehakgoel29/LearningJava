public class SumOfNodesValue {
    static Node head;  // Custom linked list head

    public static int sum(){
        Node temp = head;
        int sum = 0;
        while (temp != null) {
            sum += temp.val;
            temp = temp.next;
        }
        return sum;
    }


    public static void main(String[] args) {
        // Manually creating the linked list
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);

        System.out.println(sum()); // Output: 9
    }

    public static class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
