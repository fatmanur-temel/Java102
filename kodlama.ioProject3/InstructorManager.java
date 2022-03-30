public class InstructorManager extends UserManager{
    public void courses(Instructor instructor){
        System.out.println(instructor.getFullName()+" kullanıcısının verdiği kurslar: "+instructor.getProfession());
    }
}
