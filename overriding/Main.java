//Overriding, alt sınıfın, üst sınıftaki metod ile aynı isimde bir metot tanımlayarak,
//kendi ihtiyaçları ve istekleri doğrultusunda bu metoda işlevler yüklemesidir, yani bir metodun yeniden yazılmasıdır.
//Bir methodun override edilmesini istemiyorsak 'final' anahtar kelimesini kullanırız.

class BaseKrediManager {
    public double hesapla(double tutar){
        return tutar * 1.18;
    }

    public final double hesapla2(double miktar){
        return miktar * 2.18;
    }
}

class TarimKrediManager extends BaseKrediManager {
    //asagidaki method,
    //'hesapla2(double)' cannot override 'hesapla2(double)' in 'BaseKrediManager'; overridden method is final
    //hatası verir.
    /*public double hesapla2(double miktar){
        return miktar * 2.18;
    }*/
}

class OgretmenKrediManager extends BaseKrediManager {

    //overriding
    public double hesapla(double tutar){
        return tutar * 1.10;
    }
}

public class Main {

    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{
                new OgretmenKrediManager(), new TarimKrediManager()
        };
        for(BaseKrediManager krediManager: krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }
    }
}
