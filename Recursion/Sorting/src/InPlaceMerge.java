import java.util.Arrays;

public class InPlaceMerge {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 4,0}; // Example array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Merge the sorted halves (assumed that the first half and the second half are already sorted)
        mergeInPlace(arr, 2,arr.length - 1); // Merging [3, 5] and [1, 2, 4]

        System.out.println("Array after merge: " + Arrays.toString(arr));
    }

    static void mergeInPlace(int[] arr,int mid, int end) {
        int i = 0;      // Starting index of the left sub array
        int j = mid +1;    // Starting index of the right sub array

        // Traverse both sub arrays and merge them in place
        while (i <= 2 && j <= end) {
            // If the left element is smaller or equal, it is already in place
            if (arr[i] <= arr[j]) {
                i++;
            } else {
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
