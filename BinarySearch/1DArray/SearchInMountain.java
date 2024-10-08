public class SearchInMountain {
    /*
    Approach:
    1.first we will find which is the peak element. 
    (finding this to get 2 sorted arrays , as BS is only applicable to sorted aaray)
    2.we will run binary search from start =0 to end=peak 
    3.if this search give -1
    4.then we will run binary search from start=peak+1 and end=arr.length-1
    */

    public static void main(String[] args) {
        int[] mountainArr = {1, 3, 5, 7, 6, 4, 2};
        int target = 6;
        int result = findInMountainArray(target, mountainArr);
        System.out.println("Index of target: " + result);
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = findPeakElement(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length - 1);
    }

    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
