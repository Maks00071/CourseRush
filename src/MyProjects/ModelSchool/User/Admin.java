package MyProjects.ModelSchool.User;


import java.time.LocalDate;

public class Admin extends User {

    // реализуем конструкторы:

    // переопределим первый конструктор родителя
    public Admin() {
        super();
    }

    // переопределим второй конструктор родителя
    public Admin(String name, String password) {
        super(name, password);
    }

    // переопределим третий конструктор родителя
    public Admin(String name, String password, LocalDate dateOfBirth) {
        super(name, password, dateOfBirth);
    }
}

















