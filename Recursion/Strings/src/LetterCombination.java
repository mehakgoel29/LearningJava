import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        combination("","12");
        System.out.println(combinationRet("", ""));
        System.out.println(combinationCount("", "12"));
    }
    static void combination(String result, String original) {
        if (original.isEmpty()) {
            System.out.println(result);
            return;
        }

        int digit = original.charAt(0)-'0';  //converted '1' to 1
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a'+i);
            combination(result+ch,original.substring(1));
        }
    }
    static ArrayList<String> combinationRet(String result, String original) {
        if (original.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(result);
            return list;
        }

        int digit = original.charAt(0) - '0'; // this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(combinationRet(result + ch, original.substring(1)));
        }
        return list;
    }

    static int combinationCount(String result, String original) {
        if (original.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = original.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + combinationCount(result + ch, original.substring(1));
        }
        return count;
    }
}

