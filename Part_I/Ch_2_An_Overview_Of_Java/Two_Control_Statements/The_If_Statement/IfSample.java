package Part_I.Ch_2_An_Overview_Of_Java.Two_Control_Statements.The_If_Statement;

/*
 * Demonstrate the if.
 * Call this file "IfSample.java"
 * 
 * Simple form of if statement:
 *      if (condition) statement;
 * 
 * condition: is a Boolean expression.
*/

class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        // < : Less than
        if (x < y) System.out.println("x is less than y");

        x = x * 2;

        // == : Equal to
        if (x == y) System.out.println("x now equal to y");

        x = x * 2;
        
        // > : Greater than
        if (x > y) System.out.println("x now greater than y");

        // this won't display anything
        if (x == y) System.out.println("you won't see this");
    }
}
