package Module2.Level27.Lesson.CowAndWhale;

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Whale whale = new Whale();

        cow.printName();
        whale.printName();

        System.out.println("--------------------------");

        cow.printAll();
        whale.printAll();

        System.out.println("--------------------------");

        Cow cowWhale = new Whale();
        cowWhale.printName();  // "Я - кит"
    }
}
