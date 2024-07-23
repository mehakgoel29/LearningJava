import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(2);
        list.add(23);
        list.add(234);
        list.add(232);
        list.add(230);
        System.out.println(list);
        list.set(1, 34);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
