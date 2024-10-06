public class SkipString {
    public static void main(String[] args) {
        String ans=skip("apple","aabbbapplebcdapplemehak");
        System.out.println(ans);
    }
    public static String skip(String target,String Original) {
        if (Original.isEmpty()) {
            return "";
        }
        if (Original.startsWith(target)) {
            return skip(target, Original.substring(target.length()));
        } else {
            return Original.charAt(0)+skip(target, Original.substring(1));
        }
    }
}
