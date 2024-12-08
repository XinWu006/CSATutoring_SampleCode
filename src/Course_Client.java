public class Course_Client {
    public static void main(String[] args) {
        Course B1 = new Course ("World History", "Bryan");
        Course.welcome();
        System.out.println(B1.getCourseInfo());

        CS_Course B2 = new CS_Course("Paul", "Java");
        CS_Course.welcome_cs();
        System.out.println(B2.getCSInfo());
    }
}
