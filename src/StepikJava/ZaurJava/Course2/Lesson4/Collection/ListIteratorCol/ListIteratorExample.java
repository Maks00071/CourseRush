package StepikJava.ZaurJava.Course2.Lesson4.Collection.ListIteratorCol;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String str = "madam";
        List<Character> listChar = new LinkedList<>();

        for (char elem : str.toCharArray()) {
            listChar.add(elem);
        }

        System.out.println(listChar); // [m, a, d, a, m]

        ListIterator<Character> iterator = listChar.listIterator();  // по умолчанию начинает с индекса 0
        ListIterator<Character> reverseIterator = listChar.listIterator(listChar.size()); // начинает с последнего индекса

        boolean isPalindrome = true;

        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
