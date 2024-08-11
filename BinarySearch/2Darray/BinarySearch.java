import java.util.Arrays;

public class BinarySearch{
   public static void main(String[] args) {
    int[][]arr={
        // {10,20,30,40},
        // {15,25,35,45},
        // {28,29,37,49},
        // {33,34,38,50}
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
    };
    int[] ans=Search(arr, 3);
    System.out.println(Arrays.toString(ans));
    
   }
   static int[] Search(int[][]arr,int target){
      int r=0;
      int c=arr.length-1;
      while(r<arr.length && c>=0){
      if(arr[r][c]==target){
        return new int[]{r,c};
      }
      //reducing search space 
      else if(arr[r][c]>target){
        c--;
      }
      else{
        r++;
      }
   }
   return new int[]{-1,-1};
}}