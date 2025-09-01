package OOPsConcept;

public class FinalKeyword {
    /*
    The final keyword doesn’t directly make code faster, but by stopping changes or overriding,
    it lets the compiler and JVM optimize the code better,which can lead to improved performance.

    When something is final (variable, method, or class), the JVM knows it will never change.
    Because of this:
    The compiled bytecode for it doesn’t need to be re-generated or re-checked at runtime.
    The JVM can directly use the same compiled version every time, without extra lookups.

    That’s why it can be a little faster — no repeated “what if it’s overridden?” checks.


    Sometimes you want Stop a class from being inherited so you can use Final keyword to prevent inheritance
    Final Class → Cannot be inherited.
    Final Method → Cannot be overridden in a subclass (but can be changed in the same class’s source code).
    Final Variable → Value cannot be changed after initialization.

💡 Declaring a class as final does not make its variables final. You must explicitly add final to a variable if you want it to be constant.
    */

    final int square(int x) {   // Final method
        return x * x;
    }



}
