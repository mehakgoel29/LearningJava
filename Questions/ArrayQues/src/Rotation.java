import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 4, 2, 1, 3};
        System.out.println("Original array: " + Arrays.toString(arr));
        int[] arrClockwise = Arrays.copyOf(arr, arr.length);
        int[] arrAntiClockwise = Arrays.copyOf(arr, arr.length);
        clockwise(arrClockwise);
        antiClockwise(arrAntiClockwise);
    }
    public static void clockwise(int[] arr) {
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
        System.out.println("Clockwise rotation: " + Arrays.toString(arr));
    }

    public static void antiClockwise(int[] arr) {
        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
        System.out.println("Anti-clockwise rotation: " + Arrays.toString(arr));
    }
}
