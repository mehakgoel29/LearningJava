public class Occurances {
    public static void main(String[] args) {
        String name="mehak";
        boolean ans=checkdigit(name);
        System.out.println(ans);
    }
    static boolean checkdigit(String name){
        boolean isNumeric=true;
        for (int i = 0; i < name.length();) {
            if(name.charAt(i)<'0'|| name.charAt(i)>'9'){
               return false;
            }
            return true;
        } 
        return isNumeric;
        }
}
