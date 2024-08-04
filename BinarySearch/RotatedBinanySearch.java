public class RotatedBinanySearch {
    /*A rotated binary search is a variant of the traditional binary search algorithm used to find an element 
    in a rotated sorted array. A rotated sorted array is an array that was originally sorted but then some leading 
    elements were moved to the end. 
    For example,the sorted array [1, 2, 3, 4, 5, 6, 7] might be rotated to [4, 5, 6, 7, 1, 2, 3]. */


    /*
    
     Approach:
     1. find which part is sorted-> left or right
     2. Then we will check for boundaries (start,mid,end)
     3. based on boundaries , we will check in which direction we have to search in that sorted array

     */
    public class RotatedBinarySearch {
        public static void main(String[] args) {
            int[] nums = {4, 5, 6, 7, 0, 1, 2};
            int target = 0;
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
    
                // Determine which part is sorted
                if (nums[start] <= nums[mid]) {
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
}    
