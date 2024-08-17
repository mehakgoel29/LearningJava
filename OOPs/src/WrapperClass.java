public class WrapperClass {
    public static void main(String[] args) {
        int a=10;
        //it is not working as an object but as primitives that are stored in stack
        Integer num=29;
        // Integer num= new Integer(45); can do it like this also in earlier version of java
        //here num is an object that is stored in heap


        final int BONUS=2;
        // BONUS=3; will give error because final cannot be changed
        // always initialise final variable while declaring it because you cannot change it
        // the immutability that you cannot change its value hold only true for primitive datatypes

        final Stu mehak = new Stu("mehak");
        mehak.name = "mehak goel"; // You can modify the value of a final object but not its reference
        // mehak = new Student("mehak goel"); // This line will cause an error because mehak is final, you cannot reassign it
        System.out.println(mehak.name);
        Stu obj;
        for (int i = 0; i < 1000000000; i++) {
            obj=new Stu("object ");
        }
    }

    }
    class Stu {
        String name;
    
        public Stu(String name) {
            this.name = name;
        }


        //finalise tells java what to do when garbage collection is performing
        @Override
        protected void finalize() throws Throwable {
            System.out.println("object destroyed");
        }
    }

