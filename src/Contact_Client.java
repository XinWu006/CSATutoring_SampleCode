public class Contact_Client {
    public static void main(String[] args) {
        /* confirmation code 在#2加入 （private）
         * counter在#7加入 （staic）
         */

        // initialization
        int[] pn1 = {1, 2, 3, 4, 5, 6};
        int[] pn2 = {6, 5, 4, 3, 2, 1};
//        int[] pn_temp = {1, 0, 0, 8, 6};

        // #1
        Contact c1 = new Contact("Paul", pn1);
        Contact c2 = new Contact("Sean", pn2);
        System.out.println(c1.name);
        for (int i = 0; i < c1.phoneNumber.length; i++) {
            System.out.print(c1.phoneNumber[i]);
        }
        System.out.println();

        // #2
//        System.out.println(", " + c1.confirmationCode);
//        int cc = c1.calculateConfirmationCode();

        // #3
//        String pn_temp_str = pn_temp.phoneNumberToString1();

        // #4
        System.out.println(c1.getContactInfo());

        // #5
        int[] pn2_ = {1, 0, 0, 8, 6};
        c2.setContactInfo("Henry", pn2_);


        // #6 static
        Contact.welcome();

        // #7
        System.out.println("Total number of contacts: " + Contact.getCounter());

        // #8
//        String pn_str = phoneNumberToString2(pn_temp);
    }
}
