package StepikJava.ZaurJava.Course2.Lesson8.Volatile;

public class VolatileExample extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;

        while(b) {
            counter ++;

        }
        System.out.println("Loop is finished. Counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {

        VolatileExample thread1 = new VolatileExample();
        thread1.start(); // запускаем второстепенный поток
        Thread.sleep(3000); // "усыпляем" главный поток main

        System.out.println("After 3 seconds it is time to wake up!");

        thread1.b = false; // меняем условие работы второстепенного потока
        thread1.join(); // главняй поток ждет окончания работы второстепенного потока

        System.out.println("End of program 'main'!");

        /*
        After 3 seconds it is time to wake up!
        Loop is finished. Counter = 9331033444
        End of program 'main'!
         */
    }
}
