public class SinglyLL {

        private Node head;
        private Node tail;
        private int size;

        public SinglyLL() {
            this.size = 0;
        }

        public void insertFirst(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;

            if (tail == null) {
                tail = head;
            }
            size++;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        private class Node {
            private int val;
            private Node next;

            public Node(int val) {
                this.val = val;
            }

            public Node(int val, Node next) {
                this.val = val;
                this.next = next;
            }
        }

}
