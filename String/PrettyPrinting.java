public class PrettyPrinting {
    public static void main(String[] args) {
        float f=1234.6785f;
        String s="hello";
        System.out.println(s);
        System.out.printf("formatted number: %.2f",f);
         // System.out.printf("formatted number: %.2f",s);
       //java.util.IllegalFormatConversionException because the format specifier it expects a float or double not a String.
       //printf means formatted string

        System.out.printf("pie: %.3f",Math.PI);
        System.out.printf("hy my name is %s and i am %s","mehak","a student");
        //% is the placeholder
    }
}
