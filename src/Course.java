public class Course {
    public int duration;
    public String teacher;
    private int numOfStudents;

    public Course (int duration, String teacher) {
        this.duration = duration;
        this.teacher = teacher;
    }

    public int getNumOfStudents () {
        return this.numOfStudents;
    }

    public void setNumOfStudents (int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getCourseInfo () {
        return "Duration: " + duration + " minutes\n"
                + "Teacher: " + teacher + "\n"
                + "Number of Students: " + numOfStudents + "\n";
    }

    public static void welcome () {
        System.out.println("Welcome to class!");
    }
}