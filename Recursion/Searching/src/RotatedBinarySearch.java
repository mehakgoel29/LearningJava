public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums= {5,6,7,8,9,1,2,3};
        int ans=search(nums,2,0, nums.length-1);
        System.out.println(ans);

    }
    static int search(int[] nums , int target , int start , int end ) {


        if (start > end) {
            return -1; // Base case: element not found
        }

        //calculate mid
        int mid = start + (end - start) / 2;



        // Check if mid is the target
        if (nums[mid] == target) {
            return mid;
        }


        // Determine which part is sorted
        if (nums[start] <= nums[mid]) {
            // Left part is sorted
            if (target >= nums[start] && target < nums[mid]) {
                return search(nums, target, start, mid - 1);// Search in the left sorted part
            } else {
                return search(nums, target, mid + 1, end);// Search in the left sorted part
                // Search in the right part
            }
        } else {
            // Right part is sorted
            if (target > nums[mid] && target <= nums[end]) {
                return search(nums, target, mid + 1, end);// Search in the left sorted part
                // Search in the right sorted part
            } else {
                return search(nums, target, start, mid - 1);// Search in the left sorted part
                // Search in the left part
            }
        }
    }
}