package StepikJava.ZaurJava.ProjectOfFiveMethods;

public class FiveMethods {
    private int a;

    public FiveMethods(){
    }

    public FiveMethods(int a) {
        this.a = a;
    }

    /**
     * Метод возвращает дефолтное число объекта класса
     * @return - дефолтное число объекта класса
     */
    public int getSumNumbers() {
        return this.a;
    }

    /**
     * Перегруженных метод возвращает сумму переданных целых чисел
     * @param a - целое число
     * @return - сумма переданных целых чисел
     */
    public int getSumNumbers(int a) {
        return a;
    }

    public int getSumNumbers(int a, int b) {
        return a + getSumNumbers(b);
    }

    public int getSumNumbers(int a, int b, int c) {
        return a + getSumNumbers(b, c);
    }

    public int getSumNumbers(int a, int b, int c, int d) {
        return a + getSumNumbers(b, c, d);
    }
}

class TestFiveMethods {
    public static void main(String[] args) {
        FiveMethods elem = new FiveMethods();
        // ничего не передаем => 0
        System.out.println(elem.getSumNumbers());
        // передаем одно целое число => 5
        System.out.println(elem.getSumNumbers(5));
        // передаем два целых числа => 9
        System.out.println(elem.getSumNumbers(2, 7));
        // передаем три целых числа => 13
        System.out.println(elem.getSumNumbers(1, 5, 7));
        // передаем четыре целых числа => 23
        System.out.println(elem.getSumNumbers(2, 5, 7, 9));
    }
}
































