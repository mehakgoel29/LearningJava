public class TwoSumBruteForce {
    public static int[] findTwoSum(int[] nums, int target) {
        // Outer loop to pick the first element
        for (int i = 0; i < nums.length; i++) {
            // Inner loop to pick the second element
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of nums[i] and nums[j] equals the target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // Return the indices
                }
            }
        }

        // If no solution is found, return an empty array
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSum(nums, target);

        // Output the indices
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
