package Module2.Level1.Tasks;

/***** Корова — тоже животное *****
 * Унаследуй класс Cow от Animal.
 * Реализуй все недостающие методы в классе Cow.
 */

public class AbstractClassAnimal {
    public static void main(String[] args) {
        Cow cow = new Cow();
        System.out.println(cow.getName());
    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        public String getName() {
            return "Zoika";
        }
    }
}
