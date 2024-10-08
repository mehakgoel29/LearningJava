public class FindDuplicates {
    //NOTE:
    //This code is for sorted and consecutive duplicate values
    //if the values are not consecutive then this will not work


    static Node head;
    static Node tail;
    static int size=0;

    public FindDuplicates(){
        this.size=0;
    }

    public static void findDuplicate(Node head){
        Node curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val){
                curr.next=curr.next.next;
                // curr=curr.next;
                // Do NOT move `curr` to the next, check again for consecutive duplicates
                size--;
            }
            else{
                curr=curr.next;
            }
        }
    }

    public void insert(int val){ //insert in end of the list
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
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

    public static void main(String[] args) {
        FindDuplicates list = new FindDuplicates();
        // Add elements
        list.insert(3);
        list.insert(2);
        list.insert(2);
        list.insert(2);
        list.insert(7);
        list.insert(29);
        // Display linked list
        list.display();
        System.out.println(list.size);
        list.findDuplicate(head);
        list.display();
        System.out.println(list.size);

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
        }
    }
}
