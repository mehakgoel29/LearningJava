package Polymorphism;

public class Pink extends Colours {
    @Override // this is called annotation
    /*If you misspell the method name or mismatch the signature, the compiler will throw an error.
    Without @Override, Java will think it’s a new method, not an override.
    Makes it clear to other developers (and yourself) that this method overrides a parent class method.*/
    void color(){
        System.out.println("I am Pink");
    }
}
