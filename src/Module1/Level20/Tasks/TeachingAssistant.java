package Module1.Level20.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/************Помощник преподавателя 1**********
Программа считывает с консоли номер, находит в журнале соответствующего студента
 и вызывает его отвечать.
Но есть проблема: если в журнале нет студента с нужным номером, программа завершается
 с исключением ArrayIndexOutOfBoundsException.
 Оберни одну строку в try-catch, чтобы программа продолжала работать.
В блоке catch выведи в консоли сообщение "Студента с таким номером не существует".

Требования:
• Одна строка должна быть обернута в try-catch.
• Программа должна продолжить работу, если был введен несуществующий номер.
• Программа должна выводить сообщение "Студента с таким номером не существует"
  каждый раз при вводе несуществующего номера.
 */

public class TeachingAssistant {

    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Отвечает ";
    public static final String NOT_EXIST = "Студента с таким номером не существует";

    static List<String> studentsJournal = Arrays.asList(
            "Тимур Мясной"
            , "Пенелопа Сиволап"
            , "Орест Злобин"
            , "Ирида Продувалова"
            , "Гектор Гадюкин"
            , "Электра Чемоданова"
            , "Гвидон Недумов"
            , "Роксана Борисенко"
            , "Юлиан Мумбриков"
            , "Зигфрид Горемыкин");

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print(PROMPT_STRING);
                String input = scanner.nextLine();
                if (input.toLowerCase().equals(EXIT)) {
                    break;
                }

                int studentId = Integer.parseInt(input);

                try {
                    System.out.println(ANSWERING + studentsJournal.get(studentId));
                }
                catch(ArrayIndexOutOfBoundsException NotFind) {
                    System.out.println(NOT_EXIST);
                }
            }
    }
}



















