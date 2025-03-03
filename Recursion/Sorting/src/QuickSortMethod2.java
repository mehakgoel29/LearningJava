public class QuickSortMethod2 {
    public static void main(String[] args) {
        int[] arr = {7, 9, 15, 3, 10};
        quicksort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end]; // Choosing last element as pivot
        int index = start - 1; // Correct index initialization

        for (int i = start; i < end; i++) { // Loop until end-1
            if (arr[i] < pivot) {
                index++; // Move index forward
                // Swap arr[index] and arr[i]
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }

        // Swap pivot with element at index+1
        index++;
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;

        return index; // Return pivot's final position
    }

    public static void quicksort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivotIndex = partition(arr, start, end);
        quicksort(arr, start, pivotIndex - 1);
        quicksort(arr, pivotIndex + 1, end);
    }
}
