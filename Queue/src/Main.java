public class Main {
    public static void main(String[] args) throws Exception {
       /* CustomQueue queue = new CustomQueue();

        //insertion from End
        queue.add(34);
        queue.add(3);
        queue.add(5);
        queue.add(348);
        queue.add(304);
        queue.display();

        //removal from Front
        queue.remove();

        //display
        queue.display();

        //Front
        System.out.println(queue.front());
        */


        CircularQueue queue= new CircularQueue();
        queue.add(34);
        queue.add(3);
        queue.add(5);
        queue.add(348);
        queue.add(304);
        queue.display();
        queue.remove();
        queue.display();
        queue.add(89907);
        queue.display();


    }
}

