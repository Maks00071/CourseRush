package Module1.Level19;

public class PatternSingleton {
    //первый способ: через конструктор
//    public static final PatternSingleton PATTERN_SINGLETON = new PatternSingleton();
//
//    private PatternSingleton() {
//
//    }

    //второй способ: через статический метод
    private static final PatternSingleton PATTERN_SINGLETON = new PatternSingleton();

    private PatternSingleton() {

    }

    public static PatternSingleton getInstance() {
        return PATTERN_SINGLETON;
    }
}















