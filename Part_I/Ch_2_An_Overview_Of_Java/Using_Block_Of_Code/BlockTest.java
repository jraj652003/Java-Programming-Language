package Part_I.Ch_2_An_Overview_Of_Java.Using_Block_Of_Code;

/*
 * Demonstrate a block of code.
 * Call this file "BlockTest.java"
*/

class BlockTest {
    public static void main(String[] args) {
        int x, y;

        y = 20;

        // the target of this loop is a block
        for (x = 0; x < 10; x++) {
            System.out.println("This is x: " + x);
            System.out.println("This is y: " + y);
            y = y - 2;
        }
    }
}
