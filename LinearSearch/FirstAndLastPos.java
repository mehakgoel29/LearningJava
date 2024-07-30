public class FirstAndLastPos {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 3, 3, 3, 3, 3, 3};
        int target = 3;
        position(arr, target);
    }

    static void position(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("First occurrence: " + i);
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (target == arr[i]) {
                System.out.println("Last occurrence: " + i);
                break;
            }
        }
    }
}
