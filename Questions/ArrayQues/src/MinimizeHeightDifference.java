import java.util.Arrays;

public class MinimizeHeightDifference {

    public static int getMinDifference(int[] arr, int n, int k) {
        // Sort the array
        Arrays.sort(arr);

        // The initial difference between the maximum and minimum height
        int maxDifference = arr[n - 1] - arr[0];

        // The smallest and largest after modifying the array
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        // Traverse through the array to compute the minimal difference
        for (int i = 0; i < n - 1; i++) {
            int minVal = Math.min(smallest, arr[i + 1] - k);
            int maxVal = Math.max(largest, arr[i] + k);

            // Skip if the value goes negative
            if (minVal < 0) continue;

            // Update the minimum difference
            maxDifference = Math.min(maxDifference, maxVal - minVal);
        }

        return maxDifference;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 8, 10};
        int k1 = 2;
        System.out.println("Minimum Difference: " + getMinDifference(arr1, arr1.length, k1)); // Output: 5

        int[] arr2 = {3, 9, 12, 16, 20};
        int k2 = 3;
        System.out.println("Minimum Difference: " + getMinDifference(arr2, arr2.length, k2)); // Output: 11
    }
}
