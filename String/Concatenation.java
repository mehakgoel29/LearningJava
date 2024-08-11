import java.util.ArrayList;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println('a'+'b'); //char 
        System.out.println("a"+"b"); //string
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        //it is showing a1 because after a few steps 1 will become "1" which is a string
        //integer will be converted into Integer(wrapper class) that will call .valueof() and then .toString() internally 

        System.out.println("mehak"+new ArrayList<>());
        //commplex datastructure can be coverted into string only and only if there is atleast one string among them

        // System.out.println(new Integer(2)+new ArrayList<>()); 
         // will not work because any one from these two is not string

        System.out.println(new Integer(2)+""+new ArrayList<>()); 
        //will work because there is a string

    }

}
