public class Main {

    public static void main(String[] args) {

        // class isimlendirmelerinde pascal case kullnılır.
        // class'lar referance type'dır.
        // nesne oluştururken önce sınıfın ismi (değişkenn tipi) yazılır.
        // daha sonra o nesneye verilen isim (değişken ismi) yazılır.
        // bellekte üretilen nesne buna atanır.

        CustomerManager customerManager = new CustomerManager();

        // . ile bu nesnenin sahip olduğu foonksiyonlar çağrılabilir.

        customerManager.add();
        customerManager.remove();
    }
}

