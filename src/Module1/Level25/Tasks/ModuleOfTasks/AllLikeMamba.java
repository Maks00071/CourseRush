package Module1.Level25.Tasks.ModuleOfTasks;

import java.util.Scanner;

/***** Все любят Мамбу *****
 * Ввести с клавиатуры имя и, используя цикл while,
 * 10 раз вывести: <имя> любит меня (переменная text).
 * Каждый вывод - с новой строки.
 * Пример вывода на экран для имени Света:
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * -----
 * Требования:
 * • Программа должна считывать имя c клавиатуры.
 * • Программа должна выводить текст на экран.
 * • Программа должна выводить 10 раз текст, указанный в задании.
 *   Каждый вывод - с новой строки.
 * • В программе необходимо использовать цикл while.
 */

public class AllLikeMamba {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int count = 0;

        while (count < 10) {
            System.out.println(name + text);
            count ++;
        }
    }
}



















