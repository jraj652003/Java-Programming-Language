package Part_I.Ch_3_Data_Types_Variables_And_Arrays.Floating_point;

/*
 * Java provides two data type for floating-point numbers they are:
 *      float, double
 * 
 * These data types are signed, meaning they can store
 * positive and negative values.
 * 
 * ava implements the standard IEEE-754 set of floating-point types
 * 
 * ------------------------------------------
 * | Name    | Bits  | Approximate Range    |
 * |---------|-------|----------------------|
 * | double  | 64    | 4.9e–324 to 1.8e+308 | -> double-precision
 * | float   | 32    | 1.4e–045 to 3.4e+038 | -> single-precision
 * ------------------------------------------
*/

class RealNumber {
    public static void main(String[] args) {
        float f = 3.14F;
        double d = 3.14159265;

        System.out.println("f : " + f);
        System.out.println("d : " + d);
    }
}
