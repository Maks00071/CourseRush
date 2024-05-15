package Module1.Cat;

public class Cat {
    public static final int UNKNOWN = -1;
    public static String name;
    public static int age;

    public Cat(String name, int age) {  // первый конструктор
        this.name = name;
        this.age = age;
    }

    public Cat(String name) {   // второй конструктор
        this.name = name;
        this.age = UNKNOWN;
    }

    public Cat() {  // третий конструктор (по умолчанию)
        this.name = "Безымянный";
        this.age = UNKNOWN;
    }
}
