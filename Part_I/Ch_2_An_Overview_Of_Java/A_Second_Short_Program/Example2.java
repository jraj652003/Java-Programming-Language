package Part_I.Ch_2_An_Overview_Of_Java.A_Second_Short_Program;

/*
 * Here is another short eample.
 * Call this file "Example2.java".
 * 
 * General form of a variable declaration:
 *      type var-name;
 * 
 * General form of a variable's declaration of same type:
 *      type var-name1, var-name2, ...;
*/

class Example2 {
    public static void main(String[] args) {
        int num;  // this declares a variable called num

        num = 100;  // this assigns num the value 100

        System.out.println("This is num: " + num);

        num = num * 2;

        System.out.print("The value of num * 2 is ");
        System.out.println(num);
    }
}
