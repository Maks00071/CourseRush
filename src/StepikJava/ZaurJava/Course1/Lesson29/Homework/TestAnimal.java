package StepikJava.ZaurJava.Course1.Lesson29.Homework;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Mechenosec("Animal: Mechenosec1");
        Animal animal2 = new Pingvin("Animal: Pingvin1");
        Animal animal3 = new Leon("Animal: Leon1");

        Fish fish1 = new Mechenosec("Fish: Mechenosec2");
        Bird bird1 = new Pingvin("Bird: Pingvin2");
        Mammal mammal1 = new Leon("Mammal: Leon2");

        Mechenosec mechenosec1 = new Mechenosec("Mechenosec: Mechenosec3");
        Pingvin pingvin1 = new Pingvin("Pingvin: Pingvin3");
        Leon leon1 = new Leon("Leon: Leon3");

        Speakable speakable1 = new Pingvin("Speakable: Pingvin4");
        Speakable speakable2 = new Leon("Speakable: Leon4");

        //массив объектов Animal
        Animal[] animalsArray = {animal1, animal2, animal3, fish1, bird1, mammal1, mechenosec1, pingvin1, leon1};
        Speakable[] speakablesArray = {speakable1, speakable2, bird1, mammal1, pingvin1, leon1};

        for (Animal animal : animalsArray) {
            if (animal instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) animal;
                System.out.println(m.name);
                m.eat();
                m.swim();
                m.sleep();
            } else if (animal instanceof Pingvin) {
                Pingvin p = (Pingvin) animal;
                System.out.println(p.name);
                p.eat();
                p.fly();
                p.sleep();
                p.speak();
            } else if (animal instanceof Leon) {
                Leon l = (Leon) animal;
                System.out.println(l.name);
                l.eat();
                l.run();
                l.sleep();
                l.speak();
            }
            System.out.println("----------------------------");
        }

        System.out.println("============================");

        for (Speakable speakable : speakablesArray) {
            if (speakable instanceof Pingvin) {
                Pingvin p = (Pingvin) speakable;
                System.out.println(p.name);
                p.speak();
                p.sleep();
                p.eat();
                p.fly();
            } else if (speakable instanceof Leon) {
                Leon l = (Leon) speakable;
                System.out.println(l.name);
                l.speak();
                l.sleep();
                l.eat();
                l.run();
            }
            System.out.println("----------------------------");
        }
    }
}

































