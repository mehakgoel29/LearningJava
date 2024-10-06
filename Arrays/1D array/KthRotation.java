import java.util.Arrays;

public class KthRotation {
    public static void main(String[] args) {

    int[] arr={1,2,3,4,5,6,7};
    System.out.println("Array before Rotation");
    System.out.println(Arrays.toString(arr));
    Rotate(arr,1);
    System.out.println("Array after Rotation");
    System.out.println(Arrays.toString(arr)); 

   }

    static void Rotate(int[] arr , int k) {
        for (int j = 0; j < k; j++) {
            int firstElement=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=firstElement;
        }
       
    }
}
