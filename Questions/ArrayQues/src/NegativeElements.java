import java.lang.reflect.Array;
import java.util.Arrays;

public class NegativeElements {

    //METHOD 1
    public static void move(int [] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //METHOD 2
    private static void rearrange(int[] arr) {
        int j =0;
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
           if(arr[i]<0){
               if(j!=i){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
               j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //MAIN
    public static void main(String[] args) {
        int[] arr={90,-2,-6,8,-10,78};
        move(arr);
        rearrange(arr);
    }
}
