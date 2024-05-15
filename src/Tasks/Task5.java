package Tasks;

/*
напишем таблицу умножения
    2  3  4  5  6  7  8  9
    _  _  _  _  _  _  _  _
2 | 4  6  8  10 12 14 16 18
3 | 6  9  12 15 18 21 24 27
4 | 8  12 16 20 24 28 32 36
5 | 10 15 20 25 30 35 40 45
6 | 12 18 24 30 36 42 48 54
7 | 14 21 28 35 42 49 56 63
8 | 16 24 32 40 48 56 64 72
9 | 18 27 36 45 54 63 72 81
 */

public class Task5 {
    public static void main(String[] args) {
        System.out.println("    2  3  4  5  6  7  8  9");  // выводим значение второго множителя в строке
        System.out.println("    _  _  _  _  _  _  _  _");
        int i = 2; // первый множитель (стартовое значение)
        while (i < 10) {
            System.out.print(i + " | ");
            int j = 2;
            while (j < 10) {
                int mult = i * j;
                if (mult < 10) { // Если содержит одну цифру-после него выводим два пробела
                    System.out.print(mult + "  ");
                } else {
                    System.out.print(mult + " ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
