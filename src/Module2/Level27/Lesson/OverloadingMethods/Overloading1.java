package Module2.Level27.Lesson.OverloadingMethods;

/**
 * Посмотри на реализации метода print() в коде и определи, какой из них будет вызван.
 * Удали все лишние реализации метода print().
 * -----
 * Требования:
 * В классе Solution кроме метода main должен остаться только один метод print
 * (с правильным параметром).
 * Метод print() должен быть публичным.
 * Метод print() должен быть статическим.
 * Программа должна выводить на экран строку "Я буду Java прогером!".
 */

public class Overloading1 {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(double i) {
        System.out.println("Это double");
    }

    public static void print(Object i) {
        System.out.println("Это Object");
    }

//    public static void print(Double i) {
//        System.out.println("Это double");
//    }

    public static void print(Integer i) {
        System.out.println("Это Integer");
    }
}

//Это double
//Это Object
//Это double
//Это Integer
//Это double





















