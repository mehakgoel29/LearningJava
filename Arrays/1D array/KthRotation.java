import java.util.Arrays;

public class KthRotation {
    public static void main(String[] args) {

    int[] arr={1,2,3,4,5,6,7};
    System.out.println("Array before Rotation");
    System.out.println(Arrays.toString(arr));
    Rotate(arr,3);
    System.out.println("Array after Rotation");
    System.out.println(Arrays.toString(arr)); 

   }

    static void Rotate(int[] arr , int k) {
        for (int j = 0; j < k; j++) {
            int firstElement=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=firstElement;
        }
       
    }}
