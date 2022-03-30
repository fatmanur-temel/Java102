public class UserManager extends User {
    public void showName(User user){
        System.out.println("Kullanıcının adı: "+user.getFullName());
    }
    public void addUser(User user){
        System.out.println(user.getFullName()+" eklendi");
    }
}
