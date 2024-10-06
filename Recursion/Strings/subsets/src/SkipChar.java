public class SkipChar {
    public static void main(String[] args) {
      String ans = skip("aabbbcad");
      System.out.println(ans);
      skipA("","aabbbcad");
    }

    //METHOD 1 : with string return type
    public static String skip( String original){
        if(original.isEmpty()){
            return "";
        }

        char ch = original.charAt(0);
        if(ch=='a'){
            return skip(original.substring(1));
        }
        else {
            return ch + skip(original.substring(1));
        }
    }

    //METHOD 2: with void return type
    public static void skipA(String result, String original){
        if(original.isEmpty()){
            System.out.println(result);
            return ;
        }

        char ch = original.charAt(0);
        if(ch=='a'){
            skipA(result,original.substring(1));
        }
        else {
            skipA(result + ch, original.substring(1));
        }
    }
}
