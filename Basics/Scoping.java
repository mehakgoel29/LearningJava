public class Scoping {
    public static void main(String[] args) {
        int a=10;
        a=60;  //reassign
        {
            // a=50;
            // System.out.println(a);
            int c=20;
            System.out.println(c);
        }
        System.out.println(a);   //will print 50 because initialised outside and changed later in block
       // System.out.println(c);   cannot be accessed outside the block because it is initialized inside the another block
    }
}
