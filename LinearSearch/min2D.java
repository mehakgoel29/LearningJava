import java.util.Arrays;

public class min2D {
    public static void main(String[] args) {
        int[][] arr={
            {23,67,45},
            {2,6,1},
            {89,67,34}
        };
        int[] minVal=min(arr);
        System.out.println(Arrays.toString(minVal));
    }
    static int[]min(int [][]arr){
        int min = arr[0][0];
        int[] minPos={0,0};
        for (int rows= 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if(arr[rows][cols]< min){
                    min=arr[rows][cols];
                    minPos= new int []{rows,cols};

                }
            }
            
        }
        return minPos;
    }

}
