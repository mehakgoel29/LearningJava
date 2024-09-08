import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(45);
        deque.addFirst(34);
        deque.addLast(67);
        deque.addLast(7);
        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
    }
}
