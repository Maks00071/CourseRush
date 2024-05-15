package Tasks;
import java.util.Scanner;

/*
В этой задаче нужно:
Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
Вывести на экран строку number раз с помощью цикла do-while.
Каждое значение нужно вывести с новой строки.
Если число number меньше/равно 0 или больше/равно 5,
то введенную строку нужно вывести на экран один раз.

Пример ввода:
абв
2

Пример вывода:
абв
абв
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int number = scanner.nextInt();

        do {
            System.out.println(str);
            number--;
        } while (number > 0 && number < 4);
    }
}
