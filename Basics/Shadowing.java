public class Shadowing{
    static int x=20;    
    public static void main(String[] args) {
        {
            System.out.println(x);
            int x;
            //System.out.println(x);    shadowing will not work here 
            x=30;   //shadowing or overlapping the scope of static x ....shadowing starts after initialization
            System.out.println(x);
        }
    }
}