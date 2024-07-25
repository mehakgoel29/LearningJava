public class SmallestChar {
    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'd', 'f', 'j'};
        char target = 'c';
        char ans = smallestChar(letters, target);
        System.out.println(ans);
    }

    static char smallestChar(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        // Return the smallest character greater than the target.
        // If start is equal to letters.length, it means we have to wrap around to the beginning of the array.
        return letters[start % letters.length];
    }
}
