package MyProjects.ModelSchool.User;

/**
 * Вынесем все общие поля для пользователей: Teacher, Student, Admin в
 * отдельный абстрактный класс
 */

import java.time.LocalDate;

public abstract class User {

    private static int counter = 1;

    protected int id; // идентификатор
    protected String name; // имя
    protected String password; // пароль
    protected LocalDate dateOfBirth; // день рождения

    // Первый конструктор для параметра id. Создает уникальную последовательность при
    // каждом создании объекта
    public User() {
        this.id = counter++;
    }

    // Второй конструктор на два параметра
    public User(String name, String password) {
        this(); // мы вызываем здесь "нулевой" конструктор без аргументов User()
        this.name = name;
        this.password = password;
    }

    // Третий конструктор на три параметра
    public User(String name, String password, LocalDate dataOfBirth) {
        this(name, password); // вызываем User(String name, String password)
        this.dateOfBirth = dataOfBirth; // достраиваем, чего не хватает
    }

    /**
     * Метод входа в систему по логину и паролю пользователя
     * @param name - имя пользователя
     * @param password - пароль пользователя
     * @return - true/false для входа в систему
     */
    public boolean logIn(String name, String password) {
        System.out.println(name + " " + password);
        return true;
    }
}




























