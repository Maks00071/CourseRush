package Module1;

import java.util.ArrayList;

public class ExamplesArrayList {
    public static ArrayList<Integer> array1 = new ArrayList<Integer>();
    public static ArrayList<Integer> array2 = new ArrayList<Integer>();

    public static void main(String[] args) {
        //Занесём в список все четные числа от 1 до 20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                array1.add(i);
            }
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                array2.add(i);
            }
        }

        System.out.println("This is array1:");
        //выведем все элементы на экран
        for (int i = 0; i < array1.size(); i++) {
            System.out.print(array1.get(i) + " ");  //2 4 6 8 10 12 14 16 18 20
        }

        System.out.println();
        System.out.println("==================================");

        System.out.println("This is array2:");
        for (int i = 0; i < array2.size(); i++) {
            System.out.print(array2.get(i) + " ");
        }

        //удалим все элементы, которые делятся на 4
        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) % 4 == 0) {
                array1.remove(i);
                i--;
            }
        }

        System.out.println();
        System.out.println("==================================");

        //выведем все элементы на экран
        for (int i = 0; i < array1.size(); i++) {
            System.out.print(array1.get(i) + " ");
        }


        //удалим 3 последних элемента списка array2
        int n = array2.size();
        array2.remove(n - 3);
        array2.remove(n - 3);
        array2.remove(n - 3);

        System.out.println();
        System.out.println("==================================");

        System.out.println("This is array2:");
        for (int i = 0; i < array2.size(); i++) {
            System.out.print(array2.get(i) + " ");
        }
    }
}
