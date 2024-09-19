package StepikJava.ZaurJava.Lesson21;

import java.util.ArrayList;

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


    }
}

class Car{};
class Student{};

