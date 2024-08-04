public class OnlyDigits {
    public static void main(String[] args) {
        String name="mehak";
        boolean ans=CheckOnlyDigits(name);
        System.out.println(ans);

    }
    static boolean CheckOnlyDigits(String name){
        boolean isNumeric=true;
      for (int i = 0; i < name.length(); i++) {
        //it checks that it is not a number 
        if(name.charAt(i)<'0'|| name.charAt(i)>'9'){
          isNumeric=false;
        }
        //it checks that it is a number
        else{
            isNumeric=true;
        }
      }
      return isNumeric;
    }
}
