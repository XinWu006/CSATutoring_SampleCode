/*
#1 constructor
#2 private non-static cc helper
#3 private static pn2s1 helper
#4 public non-static getter
#5 public non-static to setter
#6 public static welcome
#7 public static cnt getter
#8 private static pn2s2 helper
 */

public class Contact {
    public String name;
    public int[] phoneNumber;
    private int confirmationCode;
    public static int counter = 0;

    /* #2
     * This function calculates the confirmation code
     * by adding the first character of the name
     * and the sum of the phone numbers, and mod the total by 11.
     *
     * accessible within this class only
     */
    private int calculateConfirmationCode() {
        int sum = name.charAt(0);
        for (int number : phoneNumber) {
            sum += number;
        }
        return sum % 11;
    }

    /* #3
     * private helper function to convert an array of integers into a string
     */
    private String phoneNumberToString1() {
        String res = "";
        for (int num : phoneNumber) {
            res += num;
        }
        return res;
    }

    /* #6
     * private helper function to convert an array of integers into a string
     */
    private static String phoneNumberToString2(int[] arr) {
        String res = "";
        for (int num : arr) {
            res += num;
        }
        return res;
    }

    /* #1
     * the constructor
     *
     * accessible in other class
     */
    public Contact(String name, int[] phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.confirmationCode = calculateConfirmationCode();
        counter ++;
    }

    /* #4
     * getter for the contact information:
     * returns a string containing the name, phone number and confirmation code.
     *
     * accessible in other class
     */
    public String getContactInfo() {
        return "The following are the information of the current contact: \n" +
                "Name: " + name +
                ",\nPhone Number: " + this.phoneNumberToString1() +
                ",\nConfirm Code: " + confirmationCode + ";";
//        return "The following are the information of the current contact: \n" +
//                "Name: " + name +
//                ",\nPhone Number: " + phoneNumberToString2(phoneNumber) +
//                ",\nConfirm Code: " + confirmationCode + ";";
    }

    /* #5
     * setter for the contact information:
     * reset the name and phone number according to the parameters,
     * and replace the confirmation code by a newly calculated one.
     */
    public void setContactInfo(String name, int[] phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.confirmationCode = calculateConfirmationCode();
    }

    /* #7
     * static function to print a welcome message
     *
     * accessible in other class
     */
    public static void welcome() {
        System.out.println("Welcome to the Contact Manager!");
    }

    /* #8
     * getter for the static counter
     *
     * accessible in other class
     */
    public static int getCounter() {
        return counter;
    }
}
