package OOPsConcept.StaticExample;

public class Main {
    public static void main(String[] args) {

        //static data can only access a static data and not non-static
        //you cannot use this keyword with static content
        Humans mehak=new Humans(20,5.2f,"Mehak");
        Humans aayu=new Humans(17,5.2f,"Aayu");
        System.out.println(mehak.population); //dont do this
        System.out.println(Humans.population); //do this by convention

    }
    void greeting(){
        System.out.println("hello");
        fun();   //it will work
    }
    static void fun(){
        System.out.println("hello hello ");
       // greeting();
        // it will not work because Non-static method 'greeting()' cannot be referenced from a static context
    }
}
