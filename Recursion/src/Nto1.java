public class Nto1 {
    public static void main(String[] args) {
        print(3);  // No need to capture any return value
    }
    static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);  // Print current value
        print(n - 1);  // Recursively print the next number
    }
}
