public class BinarySearch{
    public static void main(String [] args){
    int [] arr={2,4,6,8,10,12,67,89,45};
    int target=89;
    int ans = search(arr, target);
    System.out.println(ans);
    }
    static int search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;    //this is done because when we do (start+end)/2 it might exceeds the range of int
             if(target<arr[mid]){
                end=mid-1;
             }
             else if(target>arr[mid]){
                start=mid+1;
             }
             else{
                return mid;
             }
        }
       return -1;
    }
}
