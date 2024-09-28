public class MergeSortLinkedList {
    private static Node head;

    // Function to find the middle of the linked list
    Node getMiddle(Node head) {
       if(head==null){
           return head;
       }
       Node slow=head;
       Node fast=head;
       while(fast.next!=null && fast.next.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       return slow;   //will represent the middle element
    }

    // Merge two sorted linked lists
    Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

       Node result;
       if(left.val<=right.val){
           result=left;
           result.next=merge(left.next,right);
       }
       else{
           result=right;
           result.next=merge(left,right.next);
       }
       return result;
    }

    // Merge sort function for linked list
    Node mergeSort(Node head) {
        if(head==null ||head.next==null){
            return head; //because we only have a single node and single node is already sorted
        }
        // Get the middle of the list
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        // Split the list into two halves
        middle.next = null;

        // Sort the two halves
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        // Merge the sorted halves
        return merge(left, right);

    }

    // Function to insert a new node at the end
    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head=newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }


    // Function to print the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSortLinkedList list = new MergeSortLinkedList();

        list.insert(3);
        list.insert(5);
        list.insert(8);
        list.insert(6);
        list.insert(12);
        list.insert(1);
        list.insert(0);
        list.insert(4);

        System.out.println("Unsorted Linked List:");
        list.display();

        head=list.mergeSort(head);

        System.out.println("Sorted Linked List:");
        list.display();
    }
    class Node {
        int val;
        Node next;

        Node(int data) {
            this.val = data;
            this.next = null;
        }
    }
}