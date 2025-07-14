package InheritanceConcept;

public class BoxWeight extends Box {  //inheritance done using extends keyword
    int weight;
    BoxWeight(){
        this.weight=-1;
        //this.l=-1;
        // cannot access it in child class because
        //'l' has private access in 'InheritanceConcept. Box'
    }

    //copy constructor
    BoxWeight(BoxWeight other){
        super(other);
        weight= other.weight;
    }

    BoxWeight(int l,int w, int h,int weight ){
        super(l, w, h);
        // here l can be accessed even being private because Box class is calling it and not BoxWeight


        //use case1:
        // call a constructor of base class

        //use case2:
        // to refer the variable of parent class

        // for example :
        // if base class and child class both have same variable named as "weight"
        //then this.weight will refer to the variable of child class and super.weight will refer to the
        //variable of parent class

        this.weight=weight;
    }



}
