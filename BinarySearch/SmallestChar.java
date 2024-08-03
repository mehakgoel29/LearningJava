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
    
        // If start is equal to letters.length, return the first element (wrap around)
        //for example we have an target that is not present in the array then it should return the 0th indexed element 
        if (start == letters.length) {
            return letters[0];
        }
        // Otherwise, return the element at the start index
        return letters[start];
    }
    
}
