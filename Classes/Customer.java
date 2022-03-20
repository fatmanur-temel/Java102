public class Customer {

        private String hesapNo;
        private String isim;
        private double bakiye;
        private String email;
        private String telefonNo;

        //constructor
        public Customer(String hesapNo, String isim, double bakiye, String email, String telefonNo)
        {
            System.out.println("Yapıcı blok çalıştı.");
            this.hesapNo = hesapNo;
            this.isim = isim;
            this.bakiye = bakiye;
            this.email = email;
            this.telefonNo = telefonNo;
        }
}
