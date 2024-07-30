import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int [][] arr={
            {1,2,3,4},
            {4,5},
            {6,7,8}
        };
       for (int rows = 0; rows< arr.length; rows++) {
            System.out.println(Arrays.toString(arr[rows])+" ");
        }
    }  
    static int[][] rotate(int[][] arr){
        int firstElement=arr[0][0];
        for (int i = 1; i < arr.length; i++) {
           arr[i-1][]=arr[i][];
        }
        arr[arr.length-1][]=firstElement;
    }
}

