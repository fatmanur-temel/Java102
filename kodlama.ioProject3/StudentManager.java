public class StudentManager extends UserManager{
    public void courseName(Student student){
        System.out.println(student.getFullName()+" kişisinin aldığı kurs: "+student.getCourseName());
    }
}
