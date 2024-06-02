package Module1.Level21;

public class ExampleStackTraceElement {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        //записываем ссылку на текущую нить (ветку)
        Thread current = Thread.currentThread();
        //создадим массив элементов StackTraceElement
        StackTraceElement[] methods = current.getStackTrace();

        for (StackTraceElement info : methods) {
            System.out.printf("Имя класса: %s%n", info.getClassName());
            System.out.println("======================");
            System.out.printf("Имя метода: %s%n", info.getMethodName());
            System.out.println("======================");
            System.out.printf("Имя файла: %s%n", info.getFileName());
            System.out.println("======================");
            System.out.printf("Номер строки: %s%n", info.getLineNumber());
            System.out.println("======================");
            System.out.printf("Имя модуля: %s%n", info.getModuleName());
            System.out.println("======================");
            System.out.printf("Версия модуля: %s%n", info.getModuleVersion());
            System.out.println("******************************");
        }
    }
}
