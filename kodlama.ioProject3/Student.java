public class Student extends User {
    private String courseName;

    public Student(int id, String fullName, String email, String password,String courseName) {
        super(id, fullName, email, password);
        this.courseName = courseName;
    }

    public Student() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
