public class StackMain {
    public static void main(String[] args) throws Exception {
//        CustomStack stack =new CustomStack(3);
//        System.out.println(stack.push(1));
//        System.out.println(stack.push(4));
//        System.out.println(stack.push(6));
//        System.out.println(stack.push(8));


        DynamicStack stack =new DynamicStack(3);
        System.out.println(stack.push(1));
        System.out.println(stack.push(4));
        System.out.println(stack.push(6));
        System.out.println(stack.push(8));
        stack.traverse();


    }
}