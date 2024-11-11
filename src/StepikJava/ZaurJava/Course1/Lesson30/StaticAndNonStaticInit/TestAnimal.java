package StepikJava.ZaurJava.Course1.Lesson30.StaticAndNonStaticInit;

public class TestAnimal {
    public static void main(String[] args) {
        //Animal animal1 = new Animal();
        /*
        The STATIC INIT block in Animal
        Non-static init block in Animal
        The constructor of Animal
         */

        System.out.println("------------------------");

        //Mammal mammal1 = new Mammal();
        /*
        The STATIC INIT block in Animal
        The STATIC INIT block in Mammal
        Non-static init block in Animal
        The constructor of Animal
        Non-static init block in Mammal
        The constructor of Mammal
         */

        System.out.println("------------------------");

        Lion lion1 = new Lion();
        /*
        The STATIC INIT block in Animal
        The STATIC INIT block in Mammal
        The STATIC INIT block in Lion
        Non-static init block in Animal
        The constructor of Animal
        Non-static init block in Mammal
        The constructor of Mammal
        Non-static init block in Lion
        The constructor of Lion
         */
    }
}
