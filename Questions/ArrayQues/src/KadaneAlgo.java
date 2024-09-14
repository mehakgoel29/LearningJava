public class KadaneAlgo {
        public static int maxSubArraySum(int[] arr) {
            // Initialize maxSum to the first element
            int maxSum = arr[0];
            // Initialize currentSum to the first element
            int currentSum = arr[0];

            // Traverse the array starting from the second element
            for (int i = 1; i < arr.length; i++) {
                // Update currentSum: either the current element itself or adding the current element to the previous currentSum
                currentSum = Math.max(arr[i], currentSum + arr[i]);

                // Update maxSum if currentSum is greater than the maxSum
                maxSum = Math.max(maxSum, currentSum);
            }

            return maxSum;  // Return the maximum subarray sum found
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, -2, 5};
            System.out.println("Maximum Subarray Sum: " + maxSubArraySum(arr));  // Output: 9
        }
}
