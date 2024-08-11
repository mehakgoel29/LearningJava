public class RainWater {
    static int[] leftarr;
    static int[] rightarr;

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1, 5, 2, 3};
        int waterTrapped = rainwater(arr);
        System.out.println("Total rainwater trapped: " + waterTrapped);
    }

    static int rainwater(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        // Initialize arrays
        leftarr = new int[n];
        rightarr = new int[n];
        
        // Compute leftarr
        leftarr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftarr[i] = Math.max(leftarr[i - 1], arr[i]);
        }

        // Compute rightarr
        rightarr[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightarr[i] = Math.max(rightarr[i + 1], arr[i]);
        }

        // Compute minarr and total trapped water
        int[] minarr = new int[n];
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            minarr[i] = Math.min(leftarr[i], rightarr[i]);
            totalWater += minarr[i] - arr[i];
        }

        return totalWater;
    }
}
