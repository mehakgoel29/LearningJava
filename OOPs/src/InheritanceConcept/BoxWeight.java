package InheritanceConcept;

public class BoxWeight extends Box {  //inheritance done using extends keyword
    int weight;
    BoxWeight(){
        this.weight=-1;
        //this.ll=-1;
        // cannot access it in child class because
        //'ll' has private access in 'InheritanceConcept. Box'
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight= other.weight;
    }
    BoxWeight(int length,int width, int height,int weight ){
        super(length, width, height);
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
