import java.util.ArrayList;
import java.util.Scanner;

public class Iterate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Adding elements to the list
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // Printing elements of the list
        for (int i = 0; i < 5; i++) {
            list.get(i);
        }

        // Printing the list
        System.out.println(list);
        sc.close();
    }
}
