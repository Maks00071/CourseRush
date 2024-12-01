package StepikJava.ZaurJava.Course2.Lesson6.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class ForEach {
    public static void main(String[] args) {
        List<String> stringList = List.of("kdjf", "sdghtthujr", "s", "sdehertjhteyyjht");

        stringList.forEach(str ->
            {
                System.out.println("'" + str + "\' has the length of " + str.length());
            });
        /*
        'kdjf' has the length of 4
        'sdghtthujr' has the length of 10
        's' has the length of 1
        'sdehertjhteyyjht' has the length of 16
         */

        System.out.println("---------------------------------");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        integerList.forEach(element -> {
            System.out.println(element + " => " + (element * element));
        });
        /*
        0 => 0
        1 => 1
        2 => 4
        3 => 9
        4 => 16
        5 => 25
         */
    }
}
