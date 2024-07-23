public class Overloading {
    /*
     Method Overloading is the process of creating same methods but with different parameters and same name
     */
    static int sum(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        int result =sum(2,4);
        System.out.println(result);
        fun();
        fun(29);
    }

    static void fun(){
        System.out.println("first");
    }
    static int fun(int a){
        System.out.println("second");
        return a;
    }

}
