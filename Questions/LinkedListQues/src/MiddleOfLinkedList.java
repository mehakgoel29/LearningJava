public class MiddleOfLinkedList {
    static Node head;
    public static int middle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Moves one step
            fast = fast.next.next; // Moves two steps
        }

        return slow.val;
    }


    //METHOD 2
    public static int mid(){
        Node temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        temp=head;
        int mid=(length/2)+1;
        for (int i = 1; i <mid; i++) {
            temp=temp.next;
        }
        return temp.val;
    }
    public static void main(String[] args) {
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(4);

        System.out.println(middle());
        System.out.println(mid());
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
