package Module1;
import java.util.Scanner;

/*
* В Java есть еще одна разновидность цикла "while" — цикл "do-while".
* Он очень похож на "while" и тоже состоит всего из двух частей: «условие» и «тело цикла».
* Тело цикла выполняется снова и снова, пока условие равно "true".
* Фактически разница между "while" и "do while" только в том, что тело цикла в цикле "do-while"
* выполняется как минимум один раз.
* Операторы break и continue в цикле "do-while" работают точно так же, как в цикле "while"
 */

public class CycleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Программа вводит строки с клавиатуры, пока не введено слово "exit":
        String s;

        do {
            s = scanner.nextLine();
        } while (!s.equals("exit"));
    }
}
