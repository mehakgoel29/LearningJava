package InheritanceConcept;

public class BoxWeight extends Box {  //inheritance done using extends keyword
    int weight;
    BoxWeight(){
        this.weight=-1;
        //this.ll=-1;
        // cannot access it in child class because
        //'ll' has private access in 'InheritanceConcept. Box'
    }
    BoxWeight(int length,int width, int height,int weight ){
        super(length, width, height);  // this is how you call a constructor of base class
        this.weight=weight;
    }

}
