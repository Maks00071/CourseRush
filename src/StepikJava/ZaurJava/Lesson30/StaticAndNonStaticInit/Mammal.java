package StepikJava.ZaurJava.Lesson30.StaticAndNonStaticInit;

public class Mammal extends Animal {

    public Mammal() {
        System.out.println("The constructor of Mammal");
    }

    static {
        System.out.println("The STATIC INIT block in Mammal");
    }

    {
        System.out.println("Non-static init block in Mammal");
    }

}
