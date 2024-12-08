package StepikJava.ZaurJava.Course2.Lesson8.WaitNotify;

public class WaitNotifyExample {
    public static void main(String[] args) {
        // создаем магазин
        Market market = new Market();
        // создаем поставщика
        Producer producer = new Producer(market);
        // создаем потребителя
        Consumer consumer = new Consumer(market);

        Thread threadProducer = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);

        threadProducer.start();
        threadConsumer.start();
    }
}
