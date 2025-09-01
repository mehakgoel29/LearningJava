package OOPsConcept.StaticExample;

public class Humans {
    int age;
    float height;
    String name;
    static long population;
    //static keyword indicates that the property is object independent.
    //for example population is same for every human.For me if it is 7 billion and for you,
    // it wil also be 7 billion


    //static objects cannot be overriden

    public Humans(int age, float height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
        Humans.population+=1;
        //not using object name beacuse poplulation is static and is object independent
    }
    void show() {
        System.out.println("Original");
    }

    // ❌ This is not overriding — it's a duplicate method
//    void show() {
//        System.out.println("Changed");
//    }


}
