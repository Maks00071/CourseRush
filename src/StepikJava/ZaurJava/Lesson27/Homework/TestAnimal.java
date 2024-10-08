package StepikJava.ZaurJava.Lesson27.Homework;

public class TestAnimal {
    public static void main(String[] args) {
        Mechenosec mechenosec1 = new Mechenosec("Mikky");
        String nameMech  = mechenosec1.name;
        System.out.println(nameMech);

        mechenosec1.sleep();
        mechenosec1.eat();
        mechenosec1.swim();

        System.out.println("--------------------");

        Speakable pingvin1 = new Pingvin("Lolo");
        pingvin1.speak();

        System.out.println("--------------------");

        Animal leon1 = new Leon("Simba");
        String nameLeon1 = leon1.name;
        System.out.println(nameLeon1);
        leon1.eat();
        leon1.sleep();

        System.out.println("--------------------");

        Mammal leon2 = new Leon("Shram");
        String nameLeon2 = leon2.name;
        System.out.println(nameLeon2);
        leon2.run();
        leon2.eat();
        leon2.speak();
        leon2.sleep();
    }
}
