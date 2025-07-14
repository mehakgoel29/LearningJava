import java.util.Stack;

public class EvaluatePostfix {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"))
            //== checks for reference equality, meaning it checks if token and "+" (or other operators) point to the same memory location.
            {
                int ele1 = stack.pop();
                int ele2 = stack.pop();
                int ans = 0;

                switch (token) {
                    case "+":
                        ans = ele2 + ele1;
                        break;
                    case "-":
                        ans = ele2 - ele1;
                        break;
                    case "*":
                        ans = ele2 * ele1;
                        break;
                    case "/":
                        ans = ele2 / ele1;
                        break;
                }
                stack.push(ans);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
