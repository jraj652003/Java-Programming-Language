package Part_I.Ch_3_Data_Types_Variables_And_Arrays.Characters;

// char variables behave like integers.

class CharIsLikeInt {
    public static void main(String[] args) {
        char ch;
        
        System.out.print("English Alphabets:");
        for (ch = 'A'; ch < '['; ch++)
            System.out.print(" " + ch);
        System.out.println();
    }
}
