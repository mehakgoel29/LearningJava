import java.util.Stack;

public class StackExp {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(23);
        stack.push(82);
        stack.push(3);
        stack.push(2);
        stack.push(26);
        stack.push(23);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.peek()); /*the top most element in the stack or the last element
                                            in the array representation*/
        System.out.println(stack);
        System.out.println(stack.size()); //give the size of the stack
        System.out.println(stack.empty());
        stack.add(3,456);
        System.out.println(stack);


    }
}
