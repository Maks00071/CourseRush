package Module2.Level27.Lesson.OverloadingMethods;

public class Solution {
    public static void main(String[] args) {
        Animal animal1 = new Bear();
        Animal animal2 = new Cat();
        Animal animal3 = new Dog();
        Animal animal4 = new Snake();

        animal1.voice(); // Р-р-р!
        animal2.voice(); // Мяу!
        animal3.voice(); // Гав!
        animal4.voice(); // Ш-ш-ш!
    }
}
