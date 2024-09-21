package StepikJava.ZaurJava.Lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ClassArrayList {
    public static void main(String[] args) {
        // без ограничителей типов данных ArrayList
        ArrayList list1 = new ArrayList();

        list1.add("Hello");

        Car car = new Car();
        list1.add(car);

        Student student = new Student();
        list1.add(student);
        list1.add(new StringBuilder("Ok"));

        // с ограничителями типов данных ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<StringBuilder> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>(55);

        // методы ArrayList:

        System.out.println("--------------- .add() ----------------");

        // .add(DataType element) => boolean    -- добавление элемента
        // .add(int index, DataType element) => boolean
        ArrayList<String> array1 = new ArrayList<>();
        array1.add("How");
        array1.add("are");
        array1.add("you");
        for (String str : array1) {
            System.out.print(str + " ");    // "How are you "
        }
        System.out.println();
        array1.add(array1.size(), "?");
        for (String str : array1) {
            System.out.print(str + " "); // "How are you ? "
        }
        System.out.println();

        System.out.println("--------------- .get() ----------------");

        // .get(int index) => DataType  -- получение элемента по индексу
        System.out.println(array1.get(2)); // "you"

        System.out.println("--------------- .set() ----------------");

        // .set(int index, DataType element) => DataType  -- замена элемента массива на element по индексу
        System.out.println(array1); // "[How, are, you, ?]"
        array1.set(array1.indexOf("you"), "they");
        System.out.println(array1);  // "[How, are, they, ?]"

        System.out.println("--------------- .remove() ----------------");

        // .remove(Object element) => boolean - удаление element`a по значению
        // .remove(int index) => DataType - удаление элемента по индексу
        System.out.println(array1); // [How, are, they, ?]
        array1.remove("they");
        System.out.println(array1); // [How, are, ?]
        array1.remove(0);
        System.out.println(array1); // [are, ?]

        System.out.println("-------------- .addAll() -----------------");

        // .addAll(ArrayList aL) => boolean -- добавление в конец массива другой массив
        // .addAll(int index, ArrayList aL) => boolean -- добавление элементов другого массива в определенное место
        ArrayList<String> array2 = new ArrayList<>();
        ArrayList<String> array3 = new ArrayList<>();
        array2.add("hello");
        array2.add("!!!!!");
        array3.add("bye");
        array3.add("??!?!");
        System.out.println(array1); // [are, ?]
        array1.addAll(array2);
        System.out.println(array1); // [are, ?, hello, !!!!!]
        array1.addAll(1, array3);
        System.out.println(array1); // [are, bye, ??!?!, ?, hello, !!!!!]

        System.out.println("--------------- .clear() ----------------");

        // .clear() => void -- очистка массива
        System.out.println(array3.size()); // 2
        array3.clear();
        System.out.println(array3.size()); // 0

        System.out.println("--------------- .indexOf() ----------------");

        // .indexOf(Object element) => int -- получение индекса первого вхождения element`a
        System.out.println("array1 = " + array1); // array1 = [are, bye, ??!?!, ?, hello, !!!!!]
        System.out.println(array1.indexOf("?")); // 3

        System.out.println("--------------- .lastIndexOf() ----------------");

        // .lastIndexOf(Object element) => int -- получение индекса последнего вхождения element`a
        array1.add(0, "!!!!!");
        System.out.println("array1 = " + array1); // array1 = [!!!!!, are, bye, ??!?!, ?, hello, !!!!!]
        System.out.println(array1.lastIndexOf("!!!!!")); // 6

        System.out.println("--------------- .size() ----------------");

        // .size() => int  -- размер массива (мощность)
        System.out.println(array1); // [!!!!!, are, bye, ??!?!, ?, hello, !!!!!]
        System.out.println(array1.size()); // 7

        System.out.println("--------------- .isEmpty() ----------------");

        // .isEmpty() => boolean -- пустой ли массив? array.size() = 0
        System.out.println("array1.size() = " + array1.size()); // "array1.size() = 7"
        System.out.println("array1.isEmpty() = " + array1.isEmpty()); // "array1.isEmpty() = false"
        System.out.println("array3.size() = " + array3.size()); // "array3.size() = 0"
        System.out.println("array3.isEmpty() = " + array3.isEmpty()); // "array3.isEmpty() = true"

        System.out.println("--------------- .contains() ----------------");

        // .contains(Object element) => boolean -- содержит ли массив element (используется метод .equals())
        System.out.println(array1); // [!!!!!, are, bye, ??!?!, ?, hello, !!!!!]
        System.out.println(array1.contains("are")); // true

        System.out.println("--------------- .toString() ----------------");

        // .toString() => String -- вывести все элементы массива в виде строки
        System.out.println(array1.toString()); // [!!!!!, are, bye, ??!?!, ?, hello, !!!!!]


        // Методы ArrayList, связанные с ArrayList:

        System.out.println("--------------- .clone() ----------------");

        // .clone() => Object -- клонирует массив
        ArrayList<String> array4 = (ArrayList<String>) array1.clone();
        System.out.println(array4); // [!!!!!, are, bye, ??!?!, ?, hello, !!!!!]

        System.out.println("--------------- .toArray() ----------------");

        // .toArray() => Object[] -- преобразование ArrayList в тип Array
        // .toArray(DataType[] array) => DataType[]
        List<String> list5 = new ArrayList<>(array1);
        System.out.println(list5); // [!!!!!, are, bye, ??!?!, ?, hello, !!!!!]

        Object[] array5 = list5.toArray();
        System.out.println(array5); // [Ljava.lang.Object;@34c45dca

        for (Object object : array5) { // так мы посмотрим все элементы
            System.out.println(object);
        }

        System.out.println("--------------- Arrays.asList() ----------------");

        // Arrays.asList(DataType[]) => List<DataType> -- преобразование к списку
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] arraySbt = {sb3, sb2, sb2, sb1, sb4};

        List<StringBuilder> builderList = Arrays.asList(arraySbt);
        System.out.println(builderList); // [C, B, B, A, D]

        System.out.println("--------------- Collections.sort() ----------------");

        // Collections.sort(ArrayList<DataType>) => void -- сортировка массива
        String str1 = "A";
        String str2 = "B";
        String str3 = "C";
        String str4 = "D";

        ArrayList<String> arrayStr = new ArrayList<>();

        arrayStr.add(str3);
        arrayStr.add(str3);
        arrayStr.add(str4);
        arrayStr.add(str1);
        arrayStr.add(str2);

        System.out.println(arrayStr); // [C, C, D, A, B]

        Collections.sort(arrayStr);
        System.out.println(arrayStr); // [A, B, C, C, D]

        System.out.println("--------------- .equals() ----------------");

        // .equals(ArrayList<DataType>) => boolean -- сравнение объектов ArrayList

        ArrayList<Integer> arrayInteger1 = new ArrayList<>();
        arrayInteger1.add(5);
        arrayInteger1.add(3);
        arrayInteger1.add(9);
        arrayInteger1.add(100);
        arrayInteger1.add(1);

        ArrayList<Integer> arrayInteger2 = new ArrayList<>(arrayInteger1);

        System.out.println(arrayInteger1.equals(arrayInteger2)); // true
        arrayInteger1.set(2, 99);
        System.out.println(arrayInteger1); // [5, 3, 99, 100, 1]
        System.out.println(arrayInteger1.equals(arrayInteger2)); // false


        System.out.println("--------------- Iterator ----------------");

        Iterator<String> iter = list5.iterator();

        System.out.println(list5); // [!!!!!, are, bye, ??!?!, ?, hello, !!!!!]

        while (iter.hasNext()) {
            String str = iter.next();
            if (str.equals("bye")) {
                iter.remove();
            } else {
                System.out.println(str);
            }

        }
        System.out.println(list5); // [!!!!!, are, ??!?!, ?, hello, !!!!!]

    }
}

class Car {
};

class Student {
};




























