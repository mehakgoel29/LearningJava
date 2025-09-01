package InheritanceConcept;

public class BoxWeight extends Box {  //inheritance done using extends keyword
    int weight;
    BoxWeight(){
        this.weight=-1;
        //this.l=-1;
        // cannot access it in child class because
        //'l' has private access in 'InheritanceConcept. Box'
    }
//    static void greetings(){
//        System.out.println("hey i am in boxWeight class.greetings!");
//    }

    //copy constructor
    BoxWeight(BoxWeight other){
        super(other);
        weight= other.weight;
    }

    BoxWeight(int l,int w, int h,int weight ) {
        super(l, w, h);
        // here l can be accessed even being private because Box class is calling it and not BoxWeight


        /*
         * If we remove 'super(l, w, h);' from here,
         * then Java will automatically insert a call to the default constructor of the parent class,
         * i.e., 'super();' implicitly.
         *
         * However, this will cause a compilation error if the parent class (Box) does NOT have a default constructor.
         *
         * So, if the only constructor available in the parent class is a parameterized one,
         * we MUST explicitly call it using super(l, w, h).
         */

        
        //use case1:
        // call a constructor of base class

        //use case2:
        // to refer the variable of parent class

        /* for example :
        if base class and child class both have same variable named as "weight"
        then this.weight will refer to the variable of child class and super.weight will refer to the
        variable of parent class
         */

        this.weight = weight;
        /* super(l, w, h);
        super here will give error because child class says parent class please initialize yourself first

         Note:
         If we had written super(l, w, h); after this.weight = weight;
         It would throw a compilation error.
         Because the call to super() must be the **first** statement in the constructor.
         */

    }
}
