package StepikJava.ZaurJava.Course2.Lesson4.Collection.MapCol.HashMapCol;

import java.util.HashMap;
import java.util.Map;


public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        map1.put(1234, "Ivan Ivanov");
        map1.put(3456, "Petr Petrov");
        map1.put(9877, "Nina Sidorova");
        map1.put(3453, "Nikolay Fedorov");

        System.out.println(map1);
        // {3456=Petr Petrov, 1234=Ivan Ivanov, 9877=Nina Sidorova, 3453=Nikolay Fedorov}

        System.out.println("---------------------------------");

        map1.put(null, "Sergey Petrov");
        System.out.println(map1);
        // {3456=Petr Petrov, null=Sergey Petrov, 1234=Ivan Ivanov, 9877=Nina Sidorova, 3453=Nikolay Fedorov}

        System.out.println("---------------------------------");

        map1.putIfAbsent(3456, "Petr Sidorov");
        System.out.println(map1);

        System.out.println("---------------------------------");
        // {3456=Petr Petrov, null=Sergey Petrov, 1234=Ivan Ivanov, 9877=Nina Sidorova, 3453=Nikolay Fedorov}

        System.out.println(map1.get(1234)); // "Ivan Ivanov"

        map1.remove(null);
        System.out.println(map1);
        // {3456=Petr Petrov, 1234=Ivan Ivanov, 9877=Nina Sidorova, 3453=Nikolay Fedorov}

        System.out.println(map1.containsKey(1234)); // true
        System.out.println(map1.containsValue("Nina Sidorova")); // true
        System.out.println(map1.keySet()); // [3456, 1234, 9877, 3453]
        System.out.println(map1.values()); // [Petr Petrov, Ivan Ivanov, Nina Sidorova, Nikolay Fedorov]
    }


}





















