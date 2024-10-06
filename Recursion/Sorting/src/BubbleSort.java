import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr = {3,1,8,6,2};
        Bubble(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[] arr , int row , int col){
        if(row==0){
            return;
        }
        if(row>col){
            if(arr[col]>arr[col+1]){
                //swap
                int temp = arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;

                //recursive call to next index
                Bubble(arr, row,col+1);
            }
            else {
                Bubble(arr, row,col+1);
            }
        }
        else{
            //recursive call to next row, or you can say the remaining array
            Bubble(arr, row-1,0);
        }
    }
}

