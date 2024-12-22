package StepikJava.ZaurJava.Course2.Lesson8.Synchronizer.Semaphore;

import java.util.concurrent.ExecutionException;

public class Car implements Runnable {

    private int carNumber;

    public Car(int carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        System.out.printf("Автомобиль №%d подъехал к парковке.\n", carNumber);
        try {
            //acquire() запрашивает доступ к следующему за вызовом этого метода блоку кода,
            //если доступ не разрешен, поток вызвавший этот метод блокируется до тех пор,
            //пока семафор не разрешит доступ
            SemaphoreParking.SEMAPHORE.acquire();

            int parkingNumber = -1;

            //Ищем свободное место и паркуемся
            synchronized(SemaphoreParking.PARKING_PLACES) {
                for (int i = 0; i < 5; i++) {
                    if(!SemaphoreParking.PARKING_PLACES[i]) {       // если место свободно
                        SemaphoreParking.PARKING_PLACES[i] = true;  // занимаем его
                        parkingNumber = i;                          // Наличие свободного места, гарантирует семафор
                        System.out.printf("Автомобиль №%d припарковался на месте №%d.\n", carNumber, i);
                        break;
                    }
                }
            }
            Thread.sleep(5000); //Уходим за покупками, к примеру

            synchronized (SemaphoreParking.PARKING_PLACES) {
                SemaphoreParking.PARKING_PLACES[parkingNumber] = false;  // освобождаем место
            }
            //release(), напротив, освобождает ресурс
            SemaphoreParking.SEMAPHORE.release();
            System.out.printf("Автомобиль №%d покинул парковку.\n", carNumber);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
































