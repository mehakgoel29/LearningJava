package AbstractClassesAndInterfaces;

public class Main {
    public static void main(String[] args) {
        //Parent parent = new Parent();
        // cannot create object of an Abstract class

        Son son =new Son();
        son.career();

        Daughter daughter=new Daughter();
        daughter.career();
    }
}
