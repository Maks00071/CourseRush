package Module1.Level20.Tasks.LionAndFood;

public class Lion {

    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("ищет еду");
            System.out.println("нашел " + food.name);
            System.out.println("все съел");
        } catch (NullPointerException e) {
            System.out.println("ничего не нашел");
        } finally {
            System.out.println("лег спать " + (food == null ? "голодным" : ""));
        }
    }
}
