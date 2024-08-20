public class ClassesAndObject {
    public static void main(String[] args) {
        // If we want to create a customized datatype then we use classes
        Student[] students = new Student[5];
        //new is used for dynamic memory location
        Student mehak = new Student();
        Student Random = new Student(mehak);
        Student aayu=new Student(1,"aayu",98.2f);

//        mehak.rollno = 587;
//        mehak.name = "Mehak Goel";
//        mehak.marks = 94.3f;

        Student one = new Student();
        Student two=one;
        //both will point to same object in the heap memory
        one.name="person1";
        System.out.println(two.name);
        System.out.println(one.name);

        System.out.println("Roll Number: " + mehak.rollno);
        System.out.println("Name: " + mehak.name);
        System.out.println("Marks: " + mehak.marks);
        System.out.println(aayu.name+"'s Roll no: "+aayu.rollno);
        mehak.greeting();

       Student Random2=new Student();
        System.out.println(Random2.name);

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
        They do not have a return type because type of class itself is its return type


        'this' keyword:
        this keyword can be used to refer current class instance variable.
        If there is ambiguity between the instance variables and parameters,
        this keyword resolves the problem of ambiguity.
        It states what object you are referring to at that particular instance of time
        this keyword cannot be used with static keyword because static do no depends upon object
        */
    Student() {
       //this is how we call a constructor from another constructor
        this(2,"Mehak",100.0f);
        //internally it will be Student(2,"Mehak",100.0f);
    }

    //Student aayu=new Student(1,"aayu",90.0);

    Student(int rno,String name,float marks){
        this.rollno=rno;  //it means arpit.rollno is equal to the rollno we have passed as an argument
        this.name=name;
        this.marks=marks;
    }
    Student(Student other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }

}
