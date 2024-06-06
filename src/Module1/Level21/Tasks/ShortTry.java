package Module1.Level21.Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/******Сокращаем try*******
Программа считывает с консоли строку и выводит ее на экран в нижнем регистре.
 Не меняя функциональности программы, перепиши код с использованием try-with-resources.
 Вынеси в круглые скобки создание объектов с внешними ресурсами.
 Не забудь удалить ненужные вызовы метода close().

Требования:
•	Программа должна считать с консоли строку и вывести ее на экран в нижнем регистре.
•	В программе должен использоваться оператор try-with-resources согласно условию.
•	У объектов с внешними ресурсами не должен быть явно вызван метод close().
 */

public class ShortTry {
    public static void main(String[] args) {
//        try {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            String line = reader.readLine();
//            System.out.println(line.toLowerCase());
//            reader.close();
//        } catch (IOException e) {
//            System.out.println("Something went wrong : " + e);
//        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            System.out.println(line.toLowerCase());
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}


























