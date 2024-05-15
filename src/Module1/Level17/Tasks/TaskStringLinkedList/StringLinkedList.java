package Module1.Level17.Tasks.TaskStringLinkedList;

/************StringLinkedList***********
 Пришло время познакомиться с двусвязным списком. Решая эту задачу ты поймешь, как работает
 двусвязный список и сможешь добавлять в него элементы. У тебя есть класс "StringLinkedList", в
 котором есть поля "first" и "last", указывающие на первый и последний элемент соответственно.
 Тебе нужно реализовать логику метода "add", который будет добавлять элементы в список.

 Подсказки:

 - Для правильной реализации важно понимать, что по списку можно проходить как с первого элемента
 до последнего, так и наоборот, поэтому при добавлении новых элементов не забудь менять ссылки
 рядом стоящих.
 - Метод "add" должен создавать новый объект класса "Node", в который он поместит переданное значение.
 Перед тем как добавлять новую ноду, нужно изменить ссылку последней ноды на новосозданную, а
 новосозданная станет последней.
 - Если в списке один элемент, то на него указывает "first.next" и "last.prev" одновременно.

 Важно:
 - "Node first" не должна иметь значение, она указывает только на первый элемент(first.next);
 - "Node last" также не содержит значения, а только указывает на последний элемент(last.prev).

 Требования:
 •	При добавлении нового элемента предыдущие элементы должны получать на него ссылку.
 •	При добавлении нового элемента он должен получать ссылку на предыдущий.
 •	Поле "first" класса "StringLinkedList" должно всегда ссылаться на первый элемент,
 не содержать значение (value) и ссылку на предыдущий элемент (prev).
 •	Поле "last" класса "StringLinkedList" должно всегда ссылаться на последний элемент,
 не содержать значение (value) и ссылку на следующий элемент (next).
 */
public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        this.first.next = last;
        this.last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
            node.prev = first;
            node.next = last;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        Node searchElement = first.next;
        int count = 0;

        while (searchElement != null) {
            if (count == index) {
                return searchElement.value;
            }
            count++;
            searchElement = searchElement.next;
        }
        return null;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}




















