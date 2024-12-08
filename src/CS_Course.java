public class CS_Course extends Course{
    private String language;

    public CS_Course(String teacher, String language) {
        super("CS", teacher);
        this.language = language;
        setCourseCode(15);
    }

    public String getCSInfo () {
        return this.getCourseInfo() +
                "Language: " + language + "\n";
    }

    public static void welcome_cs () {
        welcome();
        System.out.println("This is AP CSA tutored by Paul.\n" +
                "Please find the materials in https://github.com/XinWu006/CSATutoring_SampleCode.git");
    }
}