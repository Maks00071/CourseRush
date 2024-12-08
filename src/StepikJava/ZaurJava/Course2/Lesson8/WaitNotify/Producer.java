package StepikJava.ZaurJava.Course2.Lesson8.WaitNotify;

public class Producer implements Runnable {

    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            market.putBread();
        }
    }
}
