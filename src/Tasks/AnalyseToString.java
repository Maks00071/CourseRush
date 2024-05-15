package Tasks;

/********Анализ строк*********
Требования:
•	Метод countDigits(String) должен возвращать количество цифр в переданной строке.
•	Метод countLetters(String) должен возвращать количество букв в переданной строке.
•	Метод countSpaces(String) должен возвращать количество пробелов в переданной строке.*/

public class AnalyseToString {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";
        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        char[] charArray = string.toCharArray();
        for (char elem : charArray) {
            if (Character.isDigit(elem)) {
                count ++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        int count = 0;
        char[] charArray = string.toCharArray();
        for (char elem : charArray) {
            if (Character.isLetter(elem)) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        char[] charArray = string.toCharArray();
        for (char elem : charArray) {
            if (Character.isWhitespace(elem)) {
                count++;
            }
        }
        return count;
    }
}

























