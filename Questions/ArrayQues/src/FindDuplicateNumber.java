public class FindDuplicateNumber {

    public static int findDuplicate(int[] nums) {
        // Phase 1: Using Tortoise and Hare to find the intersection point
        int tortoise = nums[0];
        int hare = nums[0];

        do {
            tortoise = nums[tortoise];   // Move tortoise by 1 step
            hare = nums[nums[hare]];     // Move hare by 2 steps
        } while (tortoise != hare);      // Loop until they meet

        // Phase 2: Find the entrance to the cycle
        tortoise = nums[0];              // Reset tortoise to start of the array
        while (tortoise != hare) {
            tortoise = nums[tortoise];   // Move both by 1 step
            hare = nums[hare];
        }

        return hare;                     // Both pointers meet at the duplicate number
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 2, 2};
        System.out.println("Duplicate number: " + findDuplicate(nums1));  // Output: 2

        int[] nums2 = {3, 1, 3, 4, 2};
        System.out.println("Duplicate number: " + findDuplicate(nums2));  // Output: 3

        int[] nums3 = {3, 3, 3, 3, 3};
        System.out.println("Duplicate number: " + findDuplicate(nums3));  // Output: 3
    }
}
