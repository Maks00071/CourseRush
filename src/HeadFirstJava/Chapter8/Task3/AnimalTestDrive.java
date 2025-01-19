package HeadFirstJava.Chapter8.Task3;

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog dog = new Dog();
        Cat cat = new Cat();

        list.add(dog);
        list.add(cat);

        System.out.println(dog.getClass());
        System.out.println(cat.getClass());
    }
}
