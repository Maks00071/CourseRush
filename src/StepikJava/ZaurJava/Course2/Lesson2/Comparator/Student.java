package StepikJava.ZaurJava.Course2.Lesson2.Comparator;


import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private String surname;

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student {" + " id = " + id +
                ", name = " + name +
                ", surname = " + surname + " }";
    }

    @Override
    public int compareTo(@NotNull Student o) {
        if (this.id == o.id) {
            return 0;
        } else if (this.id < o.id ) {
            return -1;
        } else {
            return 1;
        }
    }
}




















