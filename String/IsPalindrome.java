public class IsPalindrome {
    public static void main(String[] args) {
        String name="abcba";
        boolean ans=checkPalindrome(name);
        System.out.println(ans);
        
    }
    static boolean checkPalindrome(String name){
        name=name.toLowerCase();   //because 'a' and 'A' have different ascii value but Aba is also a palindrome
        for (int i = 0; i < name.length()/2; i++) {
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){
             return false;
            }
            
        }
        return true;

    }
    
}
