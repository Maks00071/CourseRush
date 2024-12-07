package StepikJava.ZaurJava.Course2.Lesson8.Multithreading.MinGame;

public class EggVoice extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000); //Приостанавливает поток на 1 секунду
            } catch(InterruptedException e) {
                e.getMessage();
            }
            System.out.println("Яйцо!"); //Слово «яйцо» сказано 5 раз
        }
    }
}
