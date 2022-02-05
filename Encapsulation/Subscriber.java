public class Subscriber {
    //sadece abone bilgileri tutan class
    //iyi bir encapsulation için attribute'lar private tanımlanmalıdır.

    //attribute | field
    private String _name;
    private int _remainder = 120; //yanlış veri girilmesi durumunda default bir değer verdik.
    private String _city;

    //private yapılan özelliklere başka class'lardan da ulaşabilmek için getter ve setter fonksiyonları yazarız.
    //getter (read) -> getirmek
    //setter (write) -> kurmak, değer vermek
    public String getName(){
        return _name;
    }
    public void setName(String name){
        //this.name = name; //this: bu class demek. > bu şekilde de yazılabilir fakat kötü yazıma bir örnektir.
        _name = name;
    }
    public int getRemainder(){
        return _remainder;
    }
    public void setRemainder(int remainder){
        if (remainder>=0 && remainder<=120) {
            _remainder = remainder; //if ile kontrol sağlanarak encapsulation yapmış olduk
        }
    }
    public String getCity(){
        return _city;
    }
    public void setCity(String city){
        _city = city;
    }
}
