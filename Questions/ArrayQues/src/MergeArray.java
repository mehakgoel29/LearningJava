import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 7, 8};
        int[] arr2 = {3, 6, 2};

        // Merging arr1 and arr2 and printing the result
        System.out.println(Arrays.toString(mergeArray(arr1, arr2)));
    }

    static int[] mergeArray(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        // Sort both arrays before merging
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] result = new int[m + n]; // Result array to hold merged arrays
        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for result array

        // Merge arrays until one of them is exhausted
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++; // Increment k separately
        }

        // Copy remaining elements from arr1 (if any)
        while (i < m) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements from arr2 (if any)
        while (j < n) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }
}
