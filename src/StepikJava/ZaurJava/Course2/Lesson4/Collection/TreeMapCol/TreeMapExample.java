package StepikJava.ZaurJava.Course2.Lesson4.Collection.TreeMapCol;

import java.util.TreeMap;


public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, StudentTreeMap> treeMap1 = new TreeMap<>();

        StudentTreeMap st1 = new StudentTreeMap("Maks", "Petrov", 3);
        StudentTreeMap st2 = new StudentTreeMap("Maria", "Ivanova", 1);
        StudentTreeMap st3 = new StudentTreeMap("Sergey", "Petrov", 4);
        StudentTreeMap st4 = new StudentTreeMap("Igor", "Sidorov", 3);
        StudentTreeMap st5 = new StudentTreeMap("Vasiliy", "Smirnov", 1);
        StudentTreeMap st6 = new StudentTreeMap("Alex", "Kapustin", 4);
        StudentTreeMap st7 = new StudentTreeMap("Elena", "Sidorova", 3);

        treeMap1.put(5.8, st1);
        treeMap1.put(9.1, st7);
        treeMap1.put(6.4, st2);
        treeMap1.put(7.5, st4);
        treeMap1.put(7.2, st3);
        treeMap1.put(8.2, st6);
        treeMap1.put(7.9, st5);

        System.out.println(treeMap1);
        // {
        // 5.8=Student{name='Maks', surname='Petrov', course=3},
        // 6.4=Student{name='Maria', surname='Ivanova', course=1},
        // 7.2=Student{name='Sergey', surname='Petrov', course=4},
        // 7.5=Student{name='Igor', surname='Sidorov', course=3},
        // 7.9=Student{name='Vasiliy', surname='Smirnov', course=1},
        // 8.2=Student{name='Alex', surname='Kapustin', course=4},
        // 9.1=Student{name='Elena', surname='Sidorova', course=3}
        // }

        System.out.println(treeMap1.tailMap(7.5));
        // {
        // 7.5=Student{name='Igor', surname='Sidorov', course=3},
        // 7.9=Student{name='Vasiliy', surname='Smirnov', course=1},
        // 8.2=Student{name='Alex', surname='Kapustin', course=4},
        // 9.1=Student{name='Elena', surname='Sidorova', course=3}
        // }

        System.out.println(treeMap1.headMap(7.2));
        // {
        // 5.8=Student{name='Maks', surname='Petrov', course=3},
        // 6.4=Student{name='Maria', surname='Ivanova', course=1}
        // }

        System.out.println(treeMap1.lastEntry());
        // 9.1=Student{name='Elena', surname='Sidorova', course=3}

        System.out.println(treeMap1.firstEntry());
        // 5.8=Student{name='Maks', surname='Petrov', course=3}
    }
}


















