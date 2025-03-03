public class EvenOdd {
    static Node head;  // Custom linked list head

    public static void evenodd(){
        Node temp = head;
        int even = 0;
        int odd=0;
        while (temp != null) {
           if(temp.val%2==0){
               even++;
           }
           else{
               odd++;
           }
           temp=temp.next;
        }
        System.out.println("Even count "+ even);
        System.out.println("Odd count "+ odd);

        return ;
    }


    public static void main(String[] args) {
        // Manually creating the linked list
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        evenodd();

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
