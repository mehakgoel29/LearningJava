import java.util.Arrays;

public class ReverseArr {
    static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Array After Reversal using swapping :");
        System.out.println(Arrays.toString(arr));
    }

    static void printArray(int[] arr, int size) {
        System.out.println("Array before reversal:");
        System.out.println(Arrays.toString(arr));
    }
    public static void printUsingLoop(int[] arr){
        int[] revArr=new int[arr.length];
        for (int i = 0; i < revArr.length; i++) {
            revArr[i]=arr[arr.length-i-1];
        }
        System.out.println("Reversal using Loop:");
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {23,56,78,23,45,98};
        printArray(arr, 6);
        reverseArray(arr, 0, 5);
        printUsingLoop(arr);
    }


}
