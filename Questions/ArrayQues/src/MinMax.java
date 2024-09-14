import java.util.Arrays;

public class MinMax {
    public static int min(int[] arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int max(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void display(int[] arr){
        System.out.println("Minimum element from array: " + min(arr));
        System.out.println("Maximum element from array: " + max(arr));
    }
    public static void main(String[] args) {
        int [] arr= {67,89,45,34};
        System.out.println(Arrays.toString(arr));
       display(arr);

    }
}
