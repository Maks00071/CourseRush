package StepikJava.ZaurJava.Course1.Lesson25.Example;

public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human("male");
        human1.setName("Petr");
        human1.setAge(30);
        human1.setWeight(60);

        Human human2 = new Human("male", "Ivan", 21, 58);

        System.out.println(human1.toString());
        System.out.println(human2.toString());

        Student student1 = new Student("male", "Nick", 23, 57);
        System.out.println(student1.toString());
    }
}
