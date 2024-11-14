package Part_I.Ch_2_An_Overview_Of_Java.Two_Control_Statements.The_For_Loop;

/*
 * Demonstrate the for loop.
 * Call this file "ForTest.java".
 * 
 * Simle form of the for loop:
 *      for (initialization; condition; iteration) statement;
 * 
 * initialization : sets a loop control variable to an initial
 *                : value.
 * condition      : is a Boolean expression
 * iteration      : determines how the loop control variable
 *                : will change each time the loop iterates.
*/

class ForTest {
    public static void main(String[] args) {
        int x;

        System.err.print("x is:");
        for (x = 0; x < 5; x = x + 1)
            System.out.print(" " + x);
        System.out.println();

        int y;

        System.err.print("y is:");
        for (y = 0; y < 10; y++)        // ++ : increment operator
            System.out.print(" " + y);
        System.out.println();

        int z;

        System.err.print("z is:");
        for (z = 10; z > 0; z--)        // -- : decrement operator
            System.out.print(" " + z);
        System.out.println();
    }
}
