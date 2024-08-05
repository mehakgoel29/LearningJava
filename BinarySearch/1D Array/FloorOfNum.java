public class FloorOfNum {public static void main(String[] args) {
    int[] arr = {2,3,5,9,14,16,18};
    int target = 1;
    int ans = floorNum(arr, target);
    System.out.println(ans);
}

static int floorNum(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    if(target<arr[start]){
        return -1;
    }
    while (start <= end) {
        int mid = start + (end - start) / 2; 
        // this is done because when we do (start-end)/2 it might exceeds the range of int
        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            return mid;
        }
    }
    return arr[end];
}

}
