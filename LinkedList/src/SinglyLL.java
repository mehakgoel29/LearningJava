public class SinglyLL {

        private Node head;
        private Node tail;
        public int size;

        public SinglyLL() {
            this.size = 0;
        }
        //INSERTION
        public void insertFirst(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;

            if (tail == null) {
                tail = head;
            }
            size++;
        }

        public void insertLast(int val){
            Node newNode= new Node(val);
            tail.next=newNode;
            tail=newNode;
            size++;

        }

        public void insertAtPos(int val ,int pos){
            if(pos==0){
               insertFirst(val);
               return;
            }
            if(pos==size) {
                insertLast(val);
                return;
            }
            Node temp= head;
            for (int i = 0; i <pos-1; i++) {
                temp=temp.next;
            }
            Node newnode=new Node(val,temp.next);
            temp.next=newnode;
            size++;

        }

        //DELETION
        public int deleteFirst(){
            int val=head.val;
            head=head.next;
            if(head==null){
                tail=null;
            }
            size--;
            return val;
        }

        public Node get(int pos){
            //pos is size-2 for the deletion of last element
            Node temp= head;
            for (int i = 0; i < pos; i++) {
                temp=temp.next;
            }
            return temp;
        }
        public int deleteLast(){
            int val = tail.val;
            if(size<=1){
                deleteFirst();
            }
            Node pos=get(size-2);
            tail=pos;
            tail.next=null;
            size--;
            return val;
        }
        public int deleteAtPos(int pos){
           if(pos==0){
               deleteFirst();
           }
           if(pos==size-1){
               deleteLast();
           }
           Node prev=get(pos-1);
           int val=prev.next.val;
           prev.next=prev.next.next;

           size--;
           return val;

        }
        //DISPLAY
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

