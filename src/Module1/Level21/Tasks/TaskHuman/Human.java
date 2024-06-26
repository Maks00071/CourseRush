package Module1.Level21.Tasks.TaskHuman;

import java.util.ArrayList;

/******Собственное исключение*******
В методе getChildrenCount(Human) возникает NPE (NullPointerException), оно малоинформативное.

Создай исключение ChildrenNotInitializedException в отдельном классе,
 унаследуй его от RuntimeException.
 Также создай конструктор в этом классе с параметром типа String.
 Пусть конструктор выводит свой параметр на экран.

Перехвати исключение NPE в блоке try-catch и выбрось свое исключение ChildrenNotInitializedException,
 передав в конструктор сообщение — поле message.

Требования:
•	Сигнатуру и тип возвращаемого значения метода getChildrenCount(Human) не изменяй.
•	Публичный класс ChildrenNotInitializedException должен быть создан в отдельном файле
    и наследоваться от класса RuntimeException.
•	В классе ChildrenNotInitializedException должен быть создан конструктор с параметром типа String,
    который он выводит на экран.
•	Метод getChildrenCount должен быть реализован согласно условию.
•	Класс Human не изменяй
 */

public class Human {

    private String name;
    private int age;
    private ArrayList<Human> children;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, ArrayList<Human> children) {
        this(name, age);
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }
}




















