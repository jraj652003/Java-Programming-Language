package Part_I.Ch_3_Data_Types_Variables_And_Arrays.Integers;

/*
 * Java provides four data type for integers they are:
 *      byte, short, int, long
 * 
 * These data types are signed, meaning they can store
 * positive and negative values.
 * 
 * ---------------------------------------------------------------------------
 * | Name  | Bits  | Range                                                   |
 * |-------|-------|---------------------------------------------------------|
 * | long  | 64    | –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
 * | int   | 32    | -2,147,483,648 to 2,147,483,647                         |
 * | short | 16    | -32,768 to 32,767                                       |
 * | byte  | 8     | -128 to 127                                             |
 * ---------------------------------------------------------------------------
*/

class WholeNumbers {
    public static void main(String[] args) {
        byte b = 22;
        short s = 2003;
        int i = 652003;
        long l = 8088792514L;

        System.out.println("b : " + b);
        System.out.println("s : " + s);
        System.out.println("i : " + i);
        System.out.println("l : " + l);
    }
}
