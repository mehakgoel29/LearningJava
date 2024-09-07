import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args)
    {
        /*
        System.out.println("Linked List");
        SinglyLL list = new SinglyLL();
        // Add elements in front
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(7);
        list.insertFirst(29);
        list.insertLast(38);
        list.insertAtPos(6,3);
        // Display linked list
        list.display();
        System.out.println("size :"+list.size);
        System.out.println("element deleted: "+list.deleteFirst());
        list.display();
        System.out.println("Size after deletion: "+list.size);
        System.out.println("list after last element deletion:"+list.deleteLast());
        list.display();
        System.out.println("list after deletion of element at a specific index:"+list.deleteAtPos(3));
        list.display();
        */
//        DoublyLL list=new DoublyLL();
//        list.insertFirst(23);
//        list.insertFirst(56);
//        list.insertFirst(3);
//        list.insertLast(89);
//        list.insertLast(29);
//        list.insertAtPos(89076,2);
//        list.display();
//        list.printReverse();
//        list.deleteFirst();
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.deleteAtPos(2);
//        list.display();

        CircularLL list= new CircularLL();
        list.insertFirst(23);
        list.insertFirst(56);
        list.insertFirst(3);
        list.insertLast(89);
        list.insertLast(29);
        list.insertLast(34);
        list.insertAtPos(80976,2);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.display();
        //list.deleteAtPos(3);
        list.display();

    }
}

