import java.util.Arrays;
public class Methods {
    public static void main(String[] args) {
                String name = "Hy I am Mehak Goel ";
                System.out.println(Arrays.toString(name.toCharArray()));
                System.out.println(name.toLowerCase());
                System.out.println(name.toUpperCase());
                System.out.println(name.repeat(3));
                System.out.println(name);
                //For immutable objects like String, methods that seem to "change" the object (e.g., concatenation)
                // actually return a new String object rather than modifying the original one.
                // The original String object remains unchanged.
                System.out.println(name.indexOf('a'));
                System.out.println("     mehak   ".strip());  //removes white spaces
                System.out.println(Arrays.toString(name.split(" "))); // Prints an array of substrings split by space
            }
        }

