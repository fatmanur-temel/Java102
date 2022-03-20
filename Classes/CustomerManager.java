public class CustomerManager {
    //method tutucu class'ları NameManager veya NameService olarak adlandırma yaparız.

    public void add(){
        System.out.println("Müşteri eklendi.");
    }

    public void remove(){
        System.out.println("Müşteri silindi.");
    }

    //Bir methodun içerisine veri gönderiyorsak buna parametre diyoruz.
    public void update( Customer customer){
        System.out.println(customer+" güncellendi.");
    }
}
