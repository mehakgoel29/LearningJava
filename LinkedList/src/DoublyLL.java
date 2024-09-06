public class DoublyLL {
    private Node head;
    private int size;

    public DoublyLL() {
        this.size = 0;
        this.head = null;
    }

    // INSERTION
    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        newNode.prev=null;
        size++;
    }

    public void insertLast(int val){
        Node newNode= new Node(val);
        Node temp=head;
        if(head==null){
            head.prev=null;
            head=newNode;
            return;
        }
//        for (int i = 0; i < size-1; i++) {
//            temp=temp.next;
//        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        newNode.next=null;
        size++;
    }

    public void insertAtPos(int val , int pos){
        if(pos==0){
            insertFirst(val);
            return;
        }
        if(pos==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 0; i < pos-1; i++) {
            temp=temp.next;
        }
        Node newNode = new Node(val,temp.next,temp);
        temp.next=newNode;
        temp.next.prev=newNode;

        size++;
    }
    //DISPLAY
    public void display(){
        Node temp = head;
        Node last = null;
        while (temp!=null){
            System.out.print(temp.val+"->");
            last = temp;
            temp=temp.next;
        }
        System.out.println("null");
        while(last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("null");
    }

    //RETRIEVE
    public Node find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.val==val){
                return temp;
            }
            temp=temp.next;
        }
      return null;
    }
    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
