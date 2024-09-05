import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args)
    {
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

    }
}
