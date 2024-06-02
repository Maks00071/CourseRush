package Module1.Level21.Tasks;

/*
В методе main перехвати исключение и выведи его стектрейс.

Требования:
•	Метод main должен вызывать метод dangerousMethod.
•	Метод dangerousMethod должен бросать Exception.
•	Метод main должен выводить на экран стектрейс перехваченного исключения.
 */

public class LoggingStackTrace {
    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void dangerousMethod() throws Exception{
        throw new Exception("Mu-ha-ha!");
    }
}
