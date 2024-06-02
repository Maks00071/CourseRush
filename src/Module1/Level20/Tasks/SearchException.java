package Module1.Level20.Tasks;

/************Проглатываем исключение************
Перехвати исключение в методе main, чтобы программа компилировалась.
При возникновении исключения нужно вывести на экран строку errorMessage.

Требования:
•	В методе main нужно добавить блок try-catch.
•	Метод main не должен бросать проверяемые исключения.
•	Метод main должен вызывать метод generateLuckyNumber.
•	Метод generateLuckyNumber изменять нельзя.
•	При возникновении исключения в методе main нужно вывести на экран строку errorMessage.
 */

public class SearchException {

    public static String errorMessage = "не повезло";

    public static void main(String[] args) throws Exception{
        try {
            generateLuckyNumber();
        } catch(Exception exception) {
            System.out.println(errorMessage);
            throw new Exception();
        }
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}



















