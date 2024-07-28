import java.util.Arrays;

public class RotateArray {
   public static void main(String[] args) {
    int[] arr={2,6,4,2,1};
    System.out.println("Array before Rotation");
    System.out.println(Arrays.toString(arr));
    RotateOnce(arr);
    System.out.println("Array after Rotation");
    System.out.println(Arrays.toString(arr));
    
    
   }

    static void RotateOnce(int[] arr) {
    int firstElement=arr[0];
    for (int i = 1; i < arr.length; i++) {
        arr[i-1]=arr[i];
    }
    arr[arr.length-1]=firstElement;
}
}
