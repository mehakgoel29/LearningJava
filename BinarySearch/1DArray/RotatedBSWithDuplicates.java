public class RotatedBSWithDuplicates {
    public static void main(String[] args) {
        int[] nums = {2,2,9,2,2};
        int target = 9;
        int index = search(nums, target);
        System.out.println("Index of target: " + index);
    }    
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }

            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
              if (nums[start]>nums[start+1]){
                return start;
              }
              if (nums[end]<nums[end-1]){
                return end-1;
              }
            }
            // Determine which part is sorted
            else if (nums[start] <= nums[mid]) {
                // Left part is sorted
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1; // Search in the left sorted part
                } else {
                    start = mid + 1; // Search in the right part
                }
            } else {
                // Right part is sorted
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // Search in the right sorted part
                } else {
                    end = mid - 1; // Search in the left part
                }
            }
        }

        // Target is not found
        return -1;
    }

}
