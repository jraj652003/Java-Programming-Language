package Part_I.Ch_3_Data_Types_Variables_And_Arrays.Characters;

/*
 * char data type is used to store characters in java.
 * java uses Unicode to represent characters.
 * char is 16-bit type.
 * the range of a char is 0 to 65,535.
*/

class SingleChar {
    public static void main(String[] args) {
        char ch1, ch2;

        ch1 = 88;  //  ASCII (and Unicode) code for X
        ch2 = 'Y';

        System.out.println("ch1 : " + ch1);
        System.out.println("ch2 : " + ch2);
    }
}
