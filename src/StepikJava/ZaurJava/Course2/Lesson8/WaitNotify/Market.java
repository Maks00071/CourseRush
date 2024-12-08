package StepikJava.ZaurJava.Course2.Lesson8.WaitNotify;

public class Market {
    private int breadCount = 0;

    public synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;

        System.out.println("Потрбитель купил 1 хлеб");
        System.out.println("Количество хлеба в магазине: " + breadCount);
        System.out.println("---------------------------------------------------");

        notify();
    }

    public synchronized void putBread() {
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;

        System.out.println("Производитель добавил на витрину 1 хлеб");
        System.out.println("Количество хлеба в магазине: " + breadCount);
        System.out.println("---------------------------------------------------");

        notify();
    }
}
