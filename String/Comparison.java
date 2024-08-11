public class Comparison {
    public static void main(String[] args) {
        String a ="mhk";
        String  b="mhk";
        //== operator:it checks if they are both pointing to the same object
        System.out.println(a==b);

        String aa=new String("mehak");
        String bb=new String("mehak");
        //creating object outside the pool but in heap only
        System.out.println(aa==bb);
        

        //when you only wants to check value  use .equals()
        System.out.println(aa.equals(bb));
    }
}



