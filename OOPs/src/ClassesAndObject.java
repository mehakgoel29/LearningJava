public class ClassesAndObject {
    public static void main(String[] args) {
        // If we want to create a customized datatype then we use classes
        Student[] students = new Student[5];
        //new is used for dynamic memory location
        Student mehak = new Student();
        Student Random = new Student(mehak);

//        mehak.rollno = 587;
//        mehak.name = "Mehak Goel";
//        mehak.marks = 94.3f;

        System.out.println("Roll Number: " + mehak.rollno);
        System.out.println("Name: " + mehak.name);
        System.out.println("Marks: " + mehak.marks);
        mehak.greeting();


    }
}

// Define the Student class
class Student {
    int rollno;
    String name;
    float marks=90;



    void greeting(){
        System.out.println("hello my name is "+this.name);
        //it will be replaced with
    }
    //--------------------------------------CONSTRUCTOR---------------------------------------------
        /*
        At the time of calling constructor, memory for the object is allocated in the memory.
        It is a special type of method which is used to initialize the object.
        Every time an object is created using the new() keyword, at least one constructor is called.


        'this' keyword:
        The this keyword can be used to refer current class instance variable.
        If there is ambiguity between the instance variables and parameters,
        this keyword resolves the problem of ambiguity.
        */
    Student() {
        this.rollno = 13;
        this.name = "mehak";
        this.marks = 93.9f;
    }
    Student(Student other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }

}
