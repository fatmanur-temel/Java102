//Kodlama.io 3. Gün - Ödev2
public class Main {

    public static void main(String[] args) {
        Instructor instructor = new Instructor(
                1,
                "Engin Demirog",
                "engindqmail.com",
                "123456",
                "Java");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addUser(instructor);
        instructorManager.courses(instructor);

        Student student = new Student(
                1,
                "Ali Veli",
                "aliveli@mail.com",
                "123456",
                "Java"
        );
        StudentManager studentManager = new StudentManager();
        studentManager.courseName(student);
    }
}
