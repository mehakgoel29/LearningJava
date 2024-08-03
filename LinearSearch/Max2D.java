import java.util.Arrays;

public class Max2D {

    public static void main(String[] args) {
        int [][] arr={
            {23,56,67},
            {29,800,3},
            {19,11,6}
        };
        int[] maxVal=max(arr);
        System.out.println(Arrays.toString(maxVal));
    }
    static int[] max(int[][] arr){
        int max= arr[0][0];
        int[]maxPos={0,0};
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
               if(arr[rows][cols]>max){
                max=arr[rows][cols];
                maxPos= new int[]{rows,cols};
               } 
            }
        }
        return maxPos;
    }
}
