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
        this will give error because here object itself is of parent type then how you will
        call the constructor of child class
        */

        System.out.println("Height- "+box1.height+", "
                +"Length- "+ box1.length+", "
                +"Width- "+ box1.width+" ");
        System.out.println("Height- "+box2.height+", "
                +"Length- "+ box2.length+", "
                +"Width- "+ box2.width+" ");
        System.out.println(box3.weight);

    }
}
