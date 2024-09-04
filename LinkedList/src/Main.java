public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        SinglyLL list = new SinglyLL();
        // Add elements in front
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(7);
        list.insertFirst(29);

        // Display linked list
        list.display();
    }
}