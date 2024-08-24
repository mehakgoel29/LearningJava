package InheritanceConcept;

public class BoxPrice extends BoxWeight{
    double price;
    BoxPrice(){
        super();
        this.price=price;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.price= other.price;;
    }
    public BoxPrice(int length, int width, int height, int weight, double price) {
        super(length, width, height, weight);
        this.price = price;
    }

}
