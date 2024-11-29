public class Contact {
    public String name;
    public int[] phoneNumber;
    private int confirmCode;
    public static int counter = 0;

    public Contact(String name, int[] phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.confirmCode = calculateConfirmCode();
        counter ++;
    }

    public String getContactInfo() {
        return "The following are the information of the current contact: \n" +
                "Name: " + name +
                ",\nPhone Number: " + phoneNumberToString(phoneNumber) +
                ",\nConfirm Code: " + confirmCode + ";";
    }

    public void setContactInfo(String name, int[] phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.confirmCode = calculateConfirmCode();
    }

    private int calculateConfirmCode() {
        int sum = name.charAt(0);
        for (int number : phoneNumber) {
            sum += number;
        }
        return sum % 11;
    }

    public static void welcome() {
        System.out.println("Welcome to the Contact Manager!");
    }

    public static int getCounter() {
        return counter;
    }

    private static String phoneNumberToString(int[] arr) {
        String res = "";
        for (int num : arr) {
            res += num;
        }
        return res;
    }
}
