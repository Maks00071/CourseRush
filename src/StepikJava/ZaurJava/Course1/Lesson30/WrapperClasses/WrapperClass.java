package StepikJava.ZaurJava.Course1.Lesson30.WrapperClasses;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        ArrayList<Integer> listInteger = new ArrayList<>();
        listInteger.add(5); // autoboxing int --> Integer
        Long l = 50L; // autoboxing int --> Long

        int a = listInteger.get(0); // unboxing Integer --> int
        System.out.println(a); // 5

        Integer b = new Integer(10); // autoboxing int --> Integer
        int c = b; // unboxing Integer --> int

        Number d = new Integer(25); // Number предок всех wrapper classes

        // метод .parse
        String s1 = "50"; // без пробелов !!!
        System.out.println(s1); // "50"
        int i1 = Integer.parseInt(s1);
        System.out.println(i1); // 50

        String s2 = "3.14";
        double d1 = Double.parseDouble(s2);
        System.out.println(d1); // 3.14

        // метод valueOf()
        Integer i2 = Integer.valueOf(55); // создание объекта Integer
        Double d2 = Double.valueOf(s2); // создание объекта Double

        Byte b1 = Byte.valueOf((byte) 10); // значение для Byte необходим casting !!!
    }
}
