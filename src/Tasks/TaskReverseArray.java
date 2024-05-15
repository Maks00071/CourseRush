package Tasks;
import java.util.ArrayList;

/****reverse*****
 массив int[] numbers заполняется числами в методе init(). Затем в методе reverse()
 происходит перестановка чисел в обратном порядке.
 */

public class TaskReverseArray {
    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        init();
        print();
        System.out.println();
        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(numbers.size() - 1 - i));
            numbers.set(numbers.get(numbers.size() - 1 - i), temp);
        }
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number);
        }
    }
}


















