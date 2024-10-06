import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,8,6,2};
        //checking from one because it will waste the first call when both col and max will point to the zeroth index
        selection(arr, arr.length, 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (r>c) {
            if (arr[c] > arr[max]) {
                 //c + 1 will go out of bounds when c reaches the last index of the array.
                // In the selection sort algorithm, you are trying to compare adjacent elements,
                // but arr[c+1] exceeds the array's length during the last iteration, causing an ArrayIndexOutOfBoundsException.


                //recursive call for max
                selection(arr, r, c+1, c);
            } else {
                selection(arr, r, c+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r-1, 0, 0);
        }
    }
}
