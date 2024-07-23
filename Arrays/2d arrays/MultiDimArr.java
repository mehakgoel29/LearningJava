import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArr {
    public static void main(String[] args) {
        //int[][] arr=new arr[rows][cols];
        /* 
         1 2 3
         4 5 6
         7 8 9 
         */
        // int [][] matrix={
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int[3][4];
        for (int rows = 0; rows < arr.length; rows++) {
            for(int cols=0;cols<arr[rows].length;cols++){
               arr[rows][cols]=sc.nextInt();
        }
        }
        for (int rows = 0; rows < arr.length; rows++) {
            System.out.println(Arrays.toString(arr[rows]));
        }

        //different method 
        for (int rows = 0; rows < arr.length; rows++) {
            for(int cols=0;cols<arr[rows].length;cols++){
               System.out.print(arr[rows][cols]);
        }
        System.out.println();
        }
        sc.close();
    }
}
