public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {5,6,8,910};
        int target= 910;
        int ans= search(arr, target,0,arr.length-1);
        System.out.println(ans);

    }
    public static int search(int[] arr , int target , int start , int end){
        if(start>end){
            return -1;
        }
        int mid= start+(end - start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            //left search
            return search(arr, target, start, mid-1);
        }
        //right search
        return search(arr, target, mid+1, end);
    }
}
