import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 7, 7, 7, 8, 9};
        int[] ans = searchRange(nums, 7);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential ans
                ans = mid;
                if (findStartIndex) { //searching for first index
                    end = mid - 1;
                } else {             //searching for last index 
                    start = mid + 1;
                }
            }
        }
        //final ans
        return ans;
    }   
}
