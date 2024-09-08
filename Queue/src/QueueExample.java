import java.util.LinkedList;
import java.util.Queue;
import static java.lang.System.*;
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //insertion at end
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        //deletion from front
        queue.remove();
        queue.remove();
        out.println(queue.peek());  // peek is the first element in the queue
        System.out.println(queue);



    }
}
