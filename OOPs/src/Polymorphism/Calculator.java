package Polymorphism;

public class Calculator {
//does not work because both are of same type
//    void sum(int a , int b ){
//    }
//    void  sum(int b, int a){
//    }
//
//
//    does  work because both are of diff type but order is diff
//    void sum(String a, int b) {
//        System.out.println("String, int called");
//    }
//
//    void sum(int b, String a) {
//        System.out.println("int, String called");
//    }

    //OVERLOADING
    int sum(int a , int b ){
        return a+b;
    }
    float sum(float a, float b , float c){// diff parameter diff return type
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.sum(1,2);
        cal.sum(1,2,3);
        //works even when float ?
        // Arguments are int, but method expects float
        // Java automatically promotes int → float if needed
        // So sum(1, 2, 3) becomes sum(1.0f, 2.0f, 3.0f)


        //cal.sum(2,2.33);
        //does not work ?
        //Java does NOT automatically cast double to float (as it may lose precision)
    }


}