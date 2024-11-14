package Part_I.Ch_3_Data_Types_Variables_And_Arrays.Booleans;

/*
 * java provides boolean data type for logical values.
 * it can have only one of two possible values, true or false.
 * this is the type returned by all relational operators.
*/

class OnOff {
    public static void main(String[] args) {
        boolean bulbSwitch, tvSwitch;

        bulbSwitch = false;
        tvSwitch = true;

        System.out.println("Bulb is ON " + bulbSwitch);
        System.out.println("TV is ON " + tvSwitch);
    }
}
