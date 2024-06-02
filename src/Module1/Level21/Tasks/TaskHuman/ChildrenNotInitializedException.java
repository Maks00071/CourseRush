package Module1.Level21.Tasks.TaskHuman;

public class ChildrenNotInitializedException extends RuntimeException{

    /**
     * Конструктор выводит сообщение message на экран
     * @param message - сообщение пользователю
     */
    public ChildrenNotInitializedException(String message) {
        System.out.println(message);
    }
}
