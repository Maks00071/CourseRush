package StepikJava.ZaurJava.Course2.Lesson4.Collection.InterfaceIterator;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> aL1 = new ArrayList<>();
        aL1.add("Ivan");
        aL1.add("Petr");
        aL1.add("Olga");
        aL1.add("Igor");
        aL1.add("Nina");

        Iterator<String> iterator = aL1.iterator();

        while(iterator.hasNext()) {  // если есть еще элемент в итераторе
            System.out.println(iterator.next());  // получить и вывести элемент на печать
        }
    }
}
