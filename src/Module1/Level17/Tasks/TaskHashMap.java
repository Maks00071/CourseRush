package Module1.Level17.Tasks;
import java.util.HashMap;

/******Успеваемость студентов*********
 В классе Solution объявлено поле grades типа HashMap<String, Double>, где ключ — имя и
 фамилия студента, а значение - его средняя оценка. Твоя задача — реализовать метод addStudents,
 который добавит 5 студентов с их средней оценкой в коллекцию grades.
 Значения можешь выбрать любые.

 Требования:
 •	В классе Solution нужно инициализировать публичное статическое
    поле grades типа HashMap<String, Double>.
 •	В классе Solution должен быть публичный статический метод addStudents с
    типом возвращаемого значения void.
 •	Метод addStudents должен добавлять 5 студентов со средней оценкой в поле grades.
 */

public class TaskHashMap {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Nick", 4.55);
        grades.put("Hellen", 6.78);
        grades.put("Mikke", 3.45);
        grades.put("Jon", 7.98);
        grades.put("Max", 9.87);
    }
}






















