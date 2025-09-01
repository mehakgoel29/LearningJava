package InheritanceConcept;

public class Main {
    public static void main(String[] args) {
        Box box1=new Box(4,3,5);
        Box box2=new Box(box1);

        BoxWeight box3=new BoxWeight(1,2,3,4);
        Box box4= new BoxWeight(1,2,3,4);
        //System.out.println(box4.weight);

        //still cannot access it because you can only access the variables that are defined in the
        //reference type that is Box in this case


       // BoxWeight box6= new Box();
        /*
        there are many variables in both parent and child classes
        you are given access to variables that are in the ref type i.e. BoxWeight
        hence, you should have access to weight variable
        this also means, that the ones you are trying to access should be initialised
        this will give error because here object itself is of parent type then how you will
        call the constructor of child class because parent cannot have access to child class
        */

        System.out.println("BOX1: "+"Height- "+box1.h+", "  +"Length- "+ box1.l+", "  +"Width- "+ box1.w+" ");
        System.out.println("BOX2: "+"Height- "+box2.h+", "  +"Length- "+ box2.l+", "  +"Width- "+ box2.w+" ");
        System.out.println(box3.weight);


        BoxWeight bx=new BoxWeight();  // can be inherited
        /*here:
        Your method is static.
        Static methods are resolved at compile time based on reference type.
        What you’re seeing is called method hiding, not overriding.



        Method Hiding means:

        When a static method in a subclass has the same name, parameters, and return type as a static method in its superclass, the subclass’s method hides the superclass’s method — it does not override it.
        Key Points about Method Hiding
        Happens only with static methods.
        */


        Box bx1 =new BoxWeight();  // if not static toh yha override ho jana chiye tha
        bx.greetings(); //still calls Box method because static methods cannot be overridden
    }
}
