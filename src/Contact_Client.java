public class Contact_Client {
    public static void main(String[] args) {
        Contact.welcome();

        Contact c1 = new Contact("Paul", new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(c1.getContactInfo());

        Contact c2 = new Contact("Sean", new int[]{6, 5, 4, 3, 2, 1});
        System.out.println(c2.getContactInfo());

        c2.setContactInfo("Henry", new int[]{1, 0, 0, 8, 6});
        System.out.println(c2.getContactInfo());

        System.out.println("Total number of contacts: " + Contact.getCounter());
    }
}
