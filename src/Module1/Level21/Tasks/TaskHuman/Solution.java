package Module1.Level21.Tasks.TaskHuman;

import java.util.ArrayList;

public class Solution {

    public static String message = "Похоже, что у объекта класса Human не инициализирован список детей.";

    public static void main(String[] args) {
        Human amigo = new Human("Amigo", 25, new ArrayList<>());
    }
}
