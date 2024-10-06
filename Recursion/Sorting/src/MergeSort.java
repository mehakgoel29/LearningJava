import java.util.Arrays;

public class MergeSort {

    // Complexity: O(n*log2n), where n is the work done at each level and log2n are the number of levels
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 6};
        arr = mergeSort(arr, 0, arr.length - 1);
        System.out.println("Out-of-place Merge Sort:");
        System.out.println(Arrays.toString(arr));

    }

    // Out-of-place merge sort function
    static int[] mergeSort(int[] arr, int start, int end) {
        if (arr.length==1) { // Base case: when we are down to a single element
            return new int[]{arr[start]}; // Return the single element as a new array
        }

        int mid = start + (end - start) / 2;

        // Recursively sort left and right halves
        int[] left = mergeSort(arr, start, mid);
        int[] right = mergeSort(arr, mid + 1, end);

        // Merge the sorted halves
        return merge(left, right);
    }

    // Merge two sorted arrays into one sorted array
    private static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[left.length + right.length];

        // Compare elements from left and right arrays and merge them into result
        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                result[k] = right[j];
                j++;
            } else {
                result[k] = left[i];
                i++;
            }
            k++;
        }

        // Copy any remaining elements from the left array
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right array
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }


}
