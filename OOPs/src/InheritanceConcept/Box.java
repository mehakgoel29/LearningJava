package InheritanceConcept;

public class Box {
    int length;
    int width;
    int height;
    private int ll;

    Box(){
    this.length=-1;
    this.width=-1;
    this.height=-1;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(int side){
    this.length=side;
    this.width=side;
    this.height=side;
    }
    Box(Box old){
       this.length=old.length;
       this.height= old.height;
       this.width= old.width;
    }

}
