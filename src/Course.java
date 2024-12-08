public class Course {
    public String name;
    public String teacher;
    private int courseCode;

    public Course (String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
        setCourseCode();
    }

    private void setCourseCode() {
        this.courseCode = 99000 + (int) (Math.random() * 1000);
    }

    public void setCourseCode(int code) {
        this.courseCode = 1000 * code + (int) (Math.random() * 1000);
    }

    public String getCourseInfo () {
        return "Name: " + this.name + "\n"
                + "Teacher: " + teacher + "\n"
                + "Join Code: " + courseCode + "\n";
    }

    public static void welcome () {
        System.out.println("Welcome to class!");
    }
}