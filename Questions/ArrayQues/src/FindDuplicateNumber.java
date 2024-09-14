import java.util.ArrayList;

public class FindDuplicateNumber{
    public static void main(String[] args) {
        int[] array = {1, 3, 3, 4, 5};
        findDuplicate(array);
    }

    public static void findDuplicate(int[] array) {
      /*  int n = array.length - 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int j = 0; j < array.length; j++) {
            actualSum += array[j];
        }
        int repetition = actualSum - sum;
        System.out.println("The repeated element is: " + repetition);
        */

        ArrayList<Integer> duplicates = new ArrayList<>();
        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && !duplicates.contains(array[i])) {
                    duplicates.add(array[i]);
                    System.out.println(array[i]);
                }
            }
        }
    }
}

