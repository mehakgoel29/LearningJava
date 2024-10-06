import java.util.ArrayList;
//permutation is the size!

public class StringPerm {
    public static void main(String[] args) {
        permutation("", "abc");  //here it is 3!=6 because string is "abc" and its size is 3
        System.out.println();
        ArrayList<String> result = permutationList("", "abc");
        System.out.println(result);
        System.out.println(permutationCountRet("", "abc"));
        System.out.println(permutationCount("", "abc", 0));

    }

    static void permutation(String result, String original) {
        if (original.isEmpty()){
            System.out.print(result+" ");
            return;
        }
        char ch = original.charAt(0);
        for (int i = 0; i <=result.length(); i++) {
            String first = result.substring(0,i);
            String second = result.substring(i,result.length());
            permutation(first +ch+ second,original.substring(1));
        }
    }

    static ArrayList<String> permutationList(String result, String original) {
        if (original.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(result);
            return list;
        }

        char ch = original.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= result.length(); i++) {
            String first = result.substring(0, i);
            String second = result.substring(i, result.length());
            ans.addAll(permutationList(first + ch + second, original.substring(1)));
        }
        return ans;
    }

    static int permutationCountRet(String result, String original) {
        if (original.isEmpty()) {
            return 1;
        }
        char ch = original.charAt(0);
        int count = 0;
        for (int i = 0; i <= result.length(); i++) {
            String first = result.substring(0, i);
            String second = result.substring(i, result.length());
            count = count + permutationCountRet(first + ch + second, original.substring(1));
        }
        return count;
    }


    static int permutationCount(String result, String original, int count) {
        if (original.isEmpty()) {
            return count+1;    //At this point, count needs to be incremented by 1 because you've found one valid permutation.
        }
        char ch = original.charAt(0);
        for (int i = 0; i <= result.length(); i++) {
            String first = result.substring(0, i);
            String second = result.substring(i);
            count = permutationCount(first + ch + second, original.substring(1), count);
        }
        return count;
    }
}



