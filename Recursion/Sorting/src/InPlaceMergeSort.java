import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 5, 6};
        mergeSortInPlace(array, 0, array.length - 1);
        System.out.println("In-place Merge Sort:");
        System.out.println(Arrays.toString(array)); // Output: [1, 2, 4, 5, 6]
    }

    static void mergeSortInPlace(int[] arr, int start, int end) {
        //The start and end pointers are used to help us find elements that need to be swapped.
        if (start < end) {
            int mid = start + (end - start) / 2;

            // Recursively sort the two halves
            mergeSortInPlace(arr, start, mid);   //for left
            mergeSortInPlace(arr, mid + 1, end);  //for right

            // Merge the sorted halves
            mergeInPlace(arr, start, mid, end);
        }
    }

    // In-place merge function
    static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int i = start;      // Starting index of the left sub array
        int j = mid + 1;    // Starting index of the right sub array

        // Traverse both sub arrays and merge them in place
        while (i <= mid && j <= end) {
            // If the left element is smaller or equal, it is already in place
            if (arr[i] <= arr[j]) {
                i++;
            }
            else {
                // Otherwise, arr[j] needs to be inserted into the left side
                int value = arr[j];
                int index = j;

                // Shift all elements between arr[i] and arr[j-1] to the right
                while (index > i) {
                    arr[index] = arr[index - 1];
                    index--;
                }

                arr[i] = value;

                // Update all pointers
                i++;  // Move to the next element in the left sub array
                mid++; // Increment mid as the left sub array size has increased
                j++;  // Move to the next element in the right sub array
            }
        }
    }
}

