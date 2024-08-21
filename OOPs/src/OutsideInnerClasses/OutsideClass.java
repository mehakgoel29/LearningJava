package OutsideInnerClasses;
  // outside classes cannot be static
public class OutsideClass {
    //will not work without static because if there is non-static class then it will depend
    //on the outer class and because outer class do not have any object then it will not be able
    //to help the inner class
    static  class InnerClass{
        String name;
        public  InnerClass(String name){
              this.name=name;
        }
    }

      public static void main(String[] args) {
          InnerClass a= new InnerClass("Mehak");
          InnerClass b= new InnerClass("Aayu");
          System.out.println(a.name);
          System.out.println(b.name);

      }
}
