public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sum(2468);
        System.out.println(ans);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum(n / 10);  // Recursively add last digit
    }
}