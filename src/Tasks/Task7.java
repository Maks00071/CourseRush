package Tasks;
import java.util.Arrays;

/*
Реализуй метод main(String[]), который меняет знак элемента массива array на противоположный,
если значение этого элемента чётное.
 */

public class Task7 {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = -array[i];
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
