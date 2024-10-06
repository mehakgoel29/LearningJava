public class IsSorted {
    public static void main(String[] args) {
        int[] arr= {1,2,6,4,6,6};
        System.out.println(isSort(arr,0));
    }
    public static boolean isSort(int[] arr , int i){
        if(i==arr.length-1){
            return true;
        }
        return (arr[i]<=arr[i+1])  &&  (isSort(arr,i+1));
    }
}

