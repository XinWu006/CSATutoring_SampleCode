public class CS extends Course{
    public String language;

    public CS(int duration, String teacher, String language) {
        super(duration, teacher);
        this.language = language;
    }

    public String getCSInfo () {
        return this.getCourseInfo() +
                "language: " + language + "\n";
    }

    public static void welcome_cs () {
        welcome();
        System.out.println("This is AP CSA tutored by Paul.\n" +
                "Please find the materials in https://github.com/XinWu006/CSATutoring_SampleCode.git");
    }
}