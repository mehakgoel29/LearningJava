public class Triangle2 {
    public static void main(String[] args) {
        triangle2(4,0);
    }
    static void triangle2(int rows , int cols){
        /*

      *
      **
      ***
      ****

      */
        if(rows==0){
            return;
        }
        if(rows>cols){
            triangle2(rows, cols+1);
            System.out.print("* ");

        }
        else{
            triangle2(rows-1, 0);
            System.out.println();

        }

    }
}
