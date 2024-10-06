public class SkipAppNotApple {
    public static void main(String[] args) {
        String ans= skip("aabbappbcdapple");
        System.out.println(ans);
    }
    public static String skip(String original){
        if(original.isEmpty()){
            return "";
        }
        if(original.startsWith("app") && !original.startsWith("apple")){
            return skip(original.substring(3));
        }
        else {
            return original.charAt(0)+skip(original.substring(1));
        }
    }
}
