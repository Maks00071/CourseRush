package StepikJava.ZaurJava.Course1.Lesson30.StaticAndNonStaticInit;

public class Lion extends Mammal {

    public Lion() {
        System.out.println("The constructor of Lion");
    }

    static {
        System.out.println("The STATIC INIT block in Lion");
    }

    {
        System.out.println("Non-static init block in Lion");
    }

}
