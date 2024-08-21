package OOPsConcept.StaticExample;

public class StaticBlock {

        static int a=2;
        static int b;
//run only once when the class is loaded first
        static{
            System.out.println("i am in static block");
            b=a*5;
    }

    public static void main(String[] args) {

            StaticBlock obj = new StaticBlock();
            System.out.println(StaticBlock.a+" "+StaticBlock.b);

            b+=3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock obj1=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        b+=2;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);


    }
}
