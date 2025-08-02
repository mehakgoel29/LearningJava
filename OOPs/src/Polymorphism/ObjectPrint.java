package Polymorphism;

public class ObjectPrint {

    int num;
    ObjectPrint(int num){
        this.num=num;
    }
    // Overriding the toString() method from Object class
    // This method defines what should be printed when the object is printed
    @Override
    public String toString(){
        return ("object is overriden");
    }

    public static void main(String[] args) {
        ObjectPrint obj=new ObjectPrint(56);
        System.out.println(obj);  // it will internally call the toString method
        //if the toString is not overridden it will call default toString method of object class
        //but now it will call the overridden method
    }
}
