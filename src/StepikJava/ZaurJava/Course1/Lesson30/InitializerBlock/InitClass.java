package StepikJava.ZaurJava.Course1.Lesson30.InitializerBlock;

public class InitClass {
    String name;

    {
        System.out.println("This is the init block 1");
    }

    public InitClass() {
        System.out.println("This is the constructor 1");
    }

    public InitClass(String name) {
        this();
        this.name = name;
        System.out.println("This is the constructor 2");
    }

    // Initializer Block - выполняется каждый раз при создании нового объекта
    {
        System.out.println("This is the init block 2");
    }

    // инициализация STATIC BLOCK будет только один раз
    static {
        System.out.println("This is the STATIC BLOCK 1");
    }

    {
        System.out.println("This is the init block 3");
    }

    static {
        System.out.println("This is the STATIC BLOCK 2");
    }

    public static void main(String[] args) {
        InitClass initClass1 = new InitClass("Nick");

        // вывод будет таким:
        /*
        This is the STATIC BLOCK 1
        This is the STATIC BLOCK 2
        This is the init block 1
        This is the init block 2
        This is the init block 3
        This is the constructor 1
        This is the constructor 2
         */

        InitClass initClass2 = new InitClass("Jeck");

        // вывод будет таким:
        /*
        This is the init block 1
        This is the init block 2
        This is the init block 3
        This is the constructor 1
        This is the constructor 2
         */
    }
}
