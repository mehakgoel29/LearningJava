public class OrderAgnostic {
    public static void main(String[] args) {
        int [] arr={89,67,34,78};
        int target=34;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){
    int start=0;
    int end=arr.length-1;
    boolean isAsc=arr[start]<arr[end];
    while(start<=end){
        int mid=start+(end-start)/2;    //this is done because when we do (start-end)/2 it might exceeds the range of int
         if(target==arr[mid]){
           return mid;
         }
         if(isAsc){
            if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
         }
        else{
            if(target>arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        } 
    }
   return -1;
}
    
}