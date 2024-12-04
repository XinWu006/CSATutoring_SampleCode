public class Student {
    public int id;
    public String name;
    private double grade;
    private static int cnt = 0;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.grade = 0;
        cnt ++;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public static int getCnt() {
        return cnt;
    }
}
