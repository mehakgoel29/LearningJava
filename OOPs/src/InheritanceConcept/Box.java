package InheritanceConcept;

public class Box{
    int l;
    //private  int l;
    int w;
    int h;


    // Default constructor
    Box(){
        l=w=h=-1;
    }

    //cube
    Box(int side){
        l=w=h=side;
    }

    // Parameterized constructor
    Box(int l, int w,int h){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    // Copy constructor
    //It is used to create a new object that is a copy of an existing object.
    Box(Box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;

    }
}
