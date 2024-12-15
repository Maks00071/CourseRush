package StepikJava.ZaurJava.Course2.Lesson8.Interruption;

public class InterruptedThread extends Thread {

    // сумма корней всех чисел от 1 до 1 млрд
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1_000_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("Поток хотят прервать!");
                System.out.println("Проверяем, что все системы в норме и завершаем наш поток");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
        }
    }
}
