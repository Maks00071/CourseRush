package Module1.Polymorphism;

public class Aibolit {

    public void healCat(Cat cat) {
        System.out.printf("Пациент %s здоров!%n", cat);
        cat.run();
        System.out.println("======================");
    }
}
