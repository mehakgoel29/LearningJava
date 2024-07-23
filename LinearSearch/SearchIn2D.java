import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int [][] arr={
            {23,56,67},
            {29,8,3},
            {19,11,6}
        };
        int key=23;
        int[] ans=search(arr, key);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [][]arr,int key){
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if(arr[rows][cols]==key){
                    return new int[]{rows,cols};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
