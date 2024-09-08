public class CircularLL {
    private Node head;
    private Node tail;
    private int size;

    public CircularLL() {
        this.size=0;
    }

    //INSERTION
    public void insertFirst(int val){
        Node newNode=new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            // Case 2: List is not empty
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        size++;
    }
    public void insertLast(int val){
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            // Case 2: List is not empty
            tail.next=newNode;
            tail=newNode;
            newNode.next=head;
        }

    }

    public void insertAtPos(int val,int pos){
        Node newNode = new Node(val);
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
        newNode.next = temp.next;
        temp.next = newNode;
        if (pos == size) {
            newNode.next = head;  // Update newNode's next to head if inserted at the end
        }
        size++;
    }

    //DELETION
    public int deleteFirst(){
        int val = head.val;
        head=head.next;
        tail.next=head;
        size--;
        return val;
    }
    public int deleteLast(){
        int val = tail.val;
        Node temp=head;
        do{
            temp=temp.next;
        }
        while(temp.next!=tail);
        tail=temp;
        tail.next=head;
        size--;
        return val;
    }

    public void deleteAtPos(int pos){
        Node temp=head;
        for (int i = 0; i < pos-1; i++) {
            temp = temp.next;
        }
        temp.next=temp.next.next;
    }

    //DISPLAY
    public void display(){
        Node temp=head;
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");
    }
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
