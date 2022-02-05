public class Main {
    public static void main(String[] args) {

        //Encapsulation, kullanıcı bir alanı kullanırken, kullanıcıyı kısıtlamaktır.
        //javada değişken tanımlamaları default olarak public'tir.

        Subscriber subscriber = new Subscriber();
        subscriber.setName("Fatmanur");
        subscriber.setRemainder(200);
        subscriber.setCity("Antalya");

        SubscriberManager subscriberManager = new SubscriberManager();
        subscriberManager.showRemainder(subscriber);

        //200 olarak belirlemiş olsak bile limit 120 olduğu için ekrana 120 bastı

    }
}
