public class Course_Client {
    public static void main(String[] args) {
        Course worldHistory = new Course (45, "Bryan");
        Course.welcome();
        worldHistory.setNumOfStudents(15);
        System.out.println(worldHistory.getCourseInfo());

        CS csa = new CS(120, "Paul", "Java");
        csa.setNumOfStudents(5);
        CS.welcome_cs();
        System.out.println(csa.getCSInfo());
    }
}
