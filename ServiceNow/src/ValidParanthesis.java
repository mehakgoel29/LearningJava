import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s="{(}[]";
        Stack<Character> stk=new Stack<>();
        System.out.println(isparenthesis(s,stk));
    }
    static boolean isparenthesis(String s,Stack<Character> stk) {
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='{'|| s.charAt(i)=='('|| s.charAt(i)=='[') {
                stk.push(s.charAt(i));
            }
            else
            {
                if(!stk.isEmpty()&&
                        (s.charAt(i)=='}'&& stk.peek()=='{')||
                        (s.charAt(i)==']'&& stk.peek()=='[')||
                        (s.charAt(i)==')'&& stk.peek()=='(')){
                    stk.pop();

                }
                else {
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}
