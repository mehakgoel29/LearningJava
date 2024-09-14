import java.util.Arrays;

public class KthMinMax {
    public static void main(String[] args) {
        int[] arr = {34, 23, 90, 87, 44,78,100};
        int k = 2;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(k + "th minimum element from array is: " + KthMin(k, arr));
        System.out.println(k + "th maximum element from array is: " + KthMax(k, arr));
    }

    public static int KthMin(int k, int[] arr) {
        return arr[k - 1];
    }

    public static int KthMax(int k, int[] arr) {
        return arr[arr.length - k];
    }
}
