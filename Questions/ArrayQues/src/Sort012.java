import java.util.Arrays;
import java.util.Scanner;

public class Sort012 {
    static Scanner sc = new Scanner(System.in);

    public static void sort(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void elements(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            if (num >= 0 && num <= 2) {
                arr[i] = num;
            } else {
                System.out.println("value not accepted");
                System.out.println("enter correct value");
                i--; // Retry current index
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements (0, 1, 2 only): ");
        elements(arr, size);

        System.out.println("Sorted array:");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
