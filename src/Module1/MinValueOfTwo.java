package Module1;
import java.util.Scanner;
// Вывод на экран минимального из двух чисел

public class MinValueOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println(a);
        } else if (a == b) {
            System.out.println("Числа равны");
        } else {
            System.out.println(b);
        }
    }
}
