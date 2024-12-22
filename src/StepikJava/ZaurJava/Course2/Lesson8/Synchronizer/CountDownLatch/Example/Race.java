package StepikJava.ZaurJava.Course2.Lesson8.Synchronizer.CountDownLatch.Example;

import java.util.concurrent.CountDownLatch;


/*
 * Рассмотрим следующий пример. Мы хотим провести автомобильную гонку.
 * В гонке принимают участие пять автомобилей.
 * Для начала гонки нужно, чтобы выполнились следующие условия:
 * - Каждый из пяти автомобилей подъехал к стартовой прямой;
 * - Была дана команда «На старт!»;
 * - Была дана команда «Внимание!»;
 * - Была дана команда «Марш!».
 * Важно, чтобы все автомобили стартовали одновременно.
 */

public class Race {
    //Создаем CountDownLatch на 8 "условий" - 5 автомобилей и 3 для старта
    private static final CountDownLatch START = new CountDownLatch(8);
    //Условная длина гоночной трассы
    private static final int trackLength = 500_000;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            new Thread(new Car(i, (int) (Math.random() * 100 + 50))).start();
            Thread.sleep(1000);
        }

        while (START.getCount() > 3) {    // Проверяем, собрались ли все автомобили
            Thread.sleep(100);      // у стартовой прямой. Если нет, ждем 100 ms
        }

        Thread.sleep(1000);
        System.out.println("На СТАРТ!");
        START.countDown(); // Команда дана, уменьшаем счетчик на 1
        Thread.sleep(1000);
        System.out.println("Внимание!");
        START.countDown();  // Команда дана, уменьшаем счетчик на 1
        Thread.sleep(1000);
        System.out.println("МАРШ!");
        START.countDown();  // Команда дана, уменьшаем счетчик на 1
        //счетчик становится равным нулю, и все ожидающие потоки
        //одновременно разблокируются

    }


    /**
     * Класс реализует логику работы потока для каждого объекта Car и объекта CountDownLatch
     */
    public static class Car implements Runnable {

        private int carNumber;  // порядковый номер автомобиля
        private int carSpeed;   // считаем, что скорость автомобиля постоянная

        public Car(int carNumber, int carSpeed) {
            this.carNumber = carNumber;
            this.carSpeed = carSpeed;
        }

        @Override
        public void run() {
            try {
                System.out.printf("Автомобиль №%d подъехал к стартовой прямой.\n", carNumber);
                //Автомобиль подъехал к стартовой прямой - условие выполнено
                //уменьшаем счетчик на 1
                START.countDown();
                //метод await() блокирует поток, вызвавший его, до тех пор, пока
                //счетчик CountDownLatch не станет равен 0
                START.await();
                Thread.sleep(trackLength / carSpeed); // ждем, пока автомобиль проедет трассу
                System.out.printf("Автомобиль " + " №%d финишировал!\n", carNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    Автомобиль №1 подъехал к стартовой прямой.
    Автомобиль №2 подъехал к стартовой прямой.
    Автомобиль №3 подъехал к стартовой прямой.
    Автомобиль №4 подъехал к стартовой прямой.
    Автомобиль №5 подъехал к стартовой прямой.
    На СТАРТ!
    Внимание!
    МАРШ!
    Автомобиль №3 финишировал!
    Автомобиль №1 финишировал!
    Автомобиль №2 финишировал!
    Автомобиль №5 финишировал!
    Автомобиль №4 финишировал!
     */
}







































