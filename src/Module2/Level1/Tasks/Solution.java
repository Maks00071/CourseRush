package Module2.Level1.Tasks;

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5, 7, 10);
        Dog dog = new Dog("Sharik", 4, 10, 15);

        System.out.println(cat.isDogNear(dog));
        System.out.println(dog.isCatNear(cat));
    }
}
