public class Main {
    public static void main(String[] args) {

        Subscriber subscriber = new Subscriber();
        subscriber.name = "Fatmanur";
        subscriber.remainder = 200;
        subscriber.city = "Antalya";

        SubscriberManager subscriberManager = new SubscriberManager();
        subscriberManager.showRemainder(subscriber);

    }
}
