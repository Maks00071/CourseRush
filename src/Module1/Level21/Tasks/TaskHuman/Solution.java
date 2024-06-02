package Module1.Level21.Tasks.TaskHuman;

import java.util.ArrayList;

public class Solution {

    public static String message = "Похоже, что у объекта класса Human не инициализирован список детей.";

    public static void main(String[] args) {
            Human amigo = new Human("Amigo", 25, new ArrayList<>());
            System.out.printf("Имя: %s, возраст: %d, количество детей: %d%n",
                    amigo.getName(), amigo.getAge(), getChildrenCount(amigo));

            Human diego = new Human("Diego", 35);
            System.out.printf("Имя: %s, возраст: %d, количество детей: %d%n",
                    diego.getName(), diego.getAge(), getChildrenCount(diego));
    }

    public static int getChildrenCount(Human human) {
        int size;
        try {
            size = human.getChildren().size();
            return size;
        } catch(NullPointerException e) {
            throw new ChildrenNotInitializedException(message);
        }
    }
}
