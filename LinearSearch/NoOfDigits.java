public class NoOfDigits {
    public static void main(String[] args) {
        int num = 897654;
        System.out.println(digits(num));
    }

    static int digits(int num) {
        return (int) (Math.floor(Math.log10(num)) + 1);
    }
}
