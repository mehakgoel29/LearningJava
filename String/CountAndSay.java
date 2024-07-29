public class CountAndSay {
    public static String countAndSay(int n) {
        String currentTerm = "1";
        for (int i = 2; i <= n; i++) {
            String nextTerm = "";
            int count = 1;
            char digit = currentTerm.charAt(0);
            for (int j = 1; j < currentTerm.length(); j++) {
                if (currentTerm.charAt(j) == digit) {
                    count++;
                } else {
                    nextTerm += count + "" + digit;
                    digit = currentTerm.charAt(j);
                    count = 1;
                }
            }
            nextTerm += count + "" + digit;
            currentTerm = nextTerm;
        }
        return currentTerm;
    }
    public static void main(String[] args) {
        int n = 5;
        String result = countAndSay(n);
        System.out.println("The " + n + "th term is: " + result);
    }
}
