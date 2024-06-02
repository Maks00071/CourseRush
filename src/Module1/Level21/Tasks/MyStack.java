package Module1.Level21.Tasks;

import java.util.LinkedList;
import java.util.List;

/*******Стек в домашних условиях*********

В классе MyStack нужно реализовать свою версию структуры хранения данных стек на базе списка.
Все элементы хранятся в приватном списке storage. Твоя задача реализовать все объявленные
методы класса MyStack.
Где:
- метод push(String) добавляет элемент в начало списка storage.
- метод pop() возвращает первый элемент списка storage, а потом удаляет его из этого списка.
- метод peek() возвращает первый элемент списка storage.
- метод empty() проверяет, не пустой ли список storage.
- метод search(String) ищет элемент в списке storage и возвращает его индекс.
    Если элемента нет в списке — возвращает -1.

Требования:
•	Метод push(String) должен быть реализован согласно условию.
•	Метод pop() должен быть реализован согласно условию.
•	Метод peek() должен быть реализован согласно условию.
•	Метод empty() должен быть реализован согласно условию.
•	Метод search(String) должен быть реализован согласно условию.
 */

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    /**
     * Метод добавляет элемент в начало списка
     * @param s - передаваемый элемент
     */
    public void push(String s) {
        storage.addFirst(s);
    }

    /**
     * Метод возвращает первый элемент списка, а затем удаляет его из этого списка
     * @return - первый элемент списка
     */
    public String pop() {
        String firstElem = storage.getFirst();
        storage.removeFirst();
        return firstElem;
    }

    /**
     * Метод возвращает первый элемент списка
     * @return - первый элемент списка
     */
    public String peek() {
        return storage.getFirst();
    }

    /**
     * Метод проверяет, не пустой ли список
     * @return - true(пустой) / false(не пустой)
     */
    public boolean empty() {
        return storage.isEmpty();
    }

    /**
     * Метод ищет элемент в списке и возвращает его индекс. Если элемента в списке
     * нет, то возвращает -1
     * @param s - искомый элемент
     * @return - индекс элемента в списке
     */
    public int search(String s) {
        if (storage.contains(s)) {
            return storage.indexOf(s);
        }
        return -1;
    }
}






















