package Module1.Level20.Tasks.ErrorHandler;

import java.util.Objects;

/*
Для начала разберись, что делает программа, а затем:

1. В методе addUser обработай значение, возвращаемое методом setName:
 - если setName вернул -1, выведи сообщение: "Имя не может быть null."
 - если -2, выведи сообщение: "Имя не может быть пустым."
 - если -3, выведи сообщение: "Имя не может содержать цифры."
 - если другое значение, кроме 0, выведи сообщение: "Неизвестная ошибка."
2. В методе addUser обработай значение, возвращаемое методом setAge:
 - если setAge вернул -1, выведи сообщение: "Возраст не может быть меньше 0."
 - если -2, выведи сообщение: "Возраст не может быть больше 150."
 - если другое значение, кроме 0, выведи сообщение "Неизвестная ошибка."
3. В методе findUserIndex обработай значение, возвращаемое методом indexOf:
 -  - если indexOf вернул -1, выведи сообщение "Пользователь '<имя пользователя>' не найден."
иначе — оставь текущее сообщение

Требования:
•	Значение, возвращаемое методом setName, должно быть обработано.
•	Значение, возвращаемое методом setAge, должно быть обработано.
•	Значение, возвращаемое методом indexOf, должно быть обработано.
 */
public class User {
    private String name;
    private int age;

    /**
     * Геттер
     * @return name - имя пользователя
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер с обработчиком ошибок
     * @param name - вводимое имя пользователя
     * @return - код ошибки
     */
    public int setName(String name) {
        if (name == null) {
            return -1;
        } else if (name.isEmpty()) {
            return -2;
        } else if (name.matches(".*\\d.*")) {
            return -3;
        } else {
            this.name = name;
            return 0;
        }
    }

    /**
     * Геттер
     * @return age - возраст пользователя
     */
    public int getAge() {
        return age;
    }

    /**
     * Сеттер с обработчиком ошибок
     * @param age - возраст пользователя
     * @return - код ошибки
     */
    public int setAge(int age) {
        if (age < 0) {
            return -1;
        } else if (age > 150) {
            return -2;
        } else {
            this.age = age;
            return 0;
        }
    }

    //переопределим метод equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(getName(), user.getName());
    }

    //по условию контракта переопределим так же метод hashCode()
    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}















































