package Module1.Level18.Tasks;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*****реализация Очереди**********************
Напишем простую реализацию очереди.

Класс MyQueue наследует AbstractQueue<String>, тебе нужно реализовать 5 методов.
 Значения будут храниться в списке values.
Элементы, которые должны добавляться в хвост очереди, будут добавляться в конец values.
 Элемент с индексом 0 в values будет считаться головой очереди.

Требования:
•	Метод iterator должен вернуть listIterator() списка values.
•	Метод size должен вернуть размер списка values.
•	Метод offer должен добавить новый элемент в конец списка values и вернуть true.
•	Метод poll должен вернуть элемент с индексом 0 в списке values и удалить его из списка.
    Если список пустой, то вернуть null.
•	Метод peek должен просто вернуть элемент с индексом 0 в списке values. Если список пустой,
    то вернуть null.
 */

public class MyQueue extends AbstractQueue<String> {
    private final List<String> values = new ArrayList<>();

    @Override
    public Iterator<String> iterator () {
        return values.listIterator();
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public boolean offer(String o) {
        values.addLast(o);
        return true;
    }

    @Override
    public String poll() {
        if (!values.isEmpty()) {
            String first = values.getFirst();
            values.removeFirst();
            return first;
        }
        return null;
    }

    @Override
    public String peek() {
        return !values.isEmpty() ? values.getFirst() : null;
    }
}






















