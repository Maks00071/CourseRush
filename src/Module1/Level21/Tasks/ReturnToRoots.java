package Module1.Level21.Tasks;

import java.util.Scanner;

/*******Возврат к истокам********
Программа считывает с консоли строку и выводит ее на экран в верхнем регистре.
 Но оказывается, она не будет работать на старых версиях Java (ниже 7й версии).
 Не меняя функциональности программы, перепиши блок try-with-resources на обычный try-catch.
Не забудь о вызове метода close() для объектов с внешними ресурсами.

Требования:
•	Программа должна считать с консоли строку и вывести ее на экран в верхнем регистре.
•	В программе должен использоваться блок try-catch без ресурсов.
•	У объектов с внешними ресурсами должен быть вызван метод close() в блоке finally.
 */

public class ReturnToRoots {
    public static void main(String[] args) {
//        try (Scanner scanner = new Scanner(System.in)) {
//            String line = scanner.nextLine();
//            System.out.println(line.toUpperCase());
//        } catch (Exception e) {
//            System.out.println("Something went wrong : " + e);
//        }

        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}

























