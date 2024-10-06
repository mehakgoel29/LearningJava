public class Triangle1 {
    public static void main(String[] args) {
        triangle1(4,0);
    }
    static void triangle1(int rows , int cols){
        /*


        * * * *
        * * *
        * *
        *


        */
        if(rows==0){
            return;
        }
        if(rows>cols){
            System.out.print("* ");
            triangle1(rows, cols+1);
        }
        else{
            System.out.println();
            triangle1(rows-1, 0);
        }

    }
}
