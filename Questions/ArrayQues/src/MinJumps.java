public class MinJumps {

    public static int minJumps(int[] arr) {
        int n = arr.length;

        // If the array has only one element, we're already at the end
        if (n == 1) {
            return 0;
        }

        // If the first element is 0, we can't move forward
        if (arr[0] == 0) {
            return -1;
        }

        // Initialize variables
        int jumps = 0;        // number of jumps needed
        int des = 0;         // the des index we can reach
        int pos = 0;         // curr pos

        // Traverse the array (but not including the last element)
        for (int i = 0; i < n - 1; i++) {
            // Update des index we can reach
            des = Math.max(des, i + arr[i]);

            // If we reach the end of the current jump range
            if (i == pos) {
                jumps++;         // Increment the jump count
                pos = des;   // Set the end for the next jump

                // If we've already reached or passed the last index
                if (pos >= n - 1) {
                    return jumps;
                }
            }
        }

        // If we couldn't reach the last index
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println("Minimum number of jumps to reach the end: " + minJumps(arr));  // Output: 3
    }
}
