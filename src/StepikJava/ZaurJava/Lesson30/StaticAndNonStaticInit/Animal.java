package StepikJava.ZaurJava.Lesson30.StaticAndNonStaticInit;

public class Animal {

    public Animal() {
        System.out.println("The constructor of Animal");
    }

    static {
        System.out.println("The STATIC INIT block in Animal");
    }

    {
        System.out.println("Non-static init block in Animal");
    }

}
