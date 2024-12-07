package StepikJava.ZaurJava.Course2.Lesson8.Multithreading.MinGame;

public class ChickenVoice {

    static EggVoice mAnotherOpinion;	//Побочный поток

    public static void main(String[] args) {
        mAnotherOpinion = new EggVoice(); // Создание потока
        System.out.println("Спор, начат...");
        mAnotherOpinion.start(); //Запуск потока

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1500); //Приостанавливает поток на 1 секунду
            } catch(InterruptedException e) {
                e.getMessage();
            }
            System.out.println("Курица!"); //Слово «курица» сказано 5 раз
        }

        if(mAnotherOpinion.isAlive()) { //Если оппонент еще не сказал последнее слово
            try {
                mAnotherOpinion.join(); //Подождать пока оппонент закончит высказываться
            } catch(InterruptedException e) {
                e.getMessage();
            }
        } else { //если оппонент уже закончил высказываться
            System.out.println("Первой появилась курица!");
        }
        System.out.println("Спор закончен!");
    }

}
