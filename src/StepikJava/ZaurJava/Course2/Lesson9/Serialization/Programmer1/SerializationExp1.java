package StepikJava.ZaurJava.Course2.Lesson9.Serialization.Programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class SerializationExp1 {
    public static void main(String[] args) {

        List<String> employeesFrom = new ArrayList<>();

        employeesFrom.add("Maks");
        employeesFrom.add("Ivan");
        employeesFrom.add("Elena");

        // выполним сериализацию объекта employeesFrom
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employeesAll.bin"))
        ) {
            outputStream.writeObject(employeesFrom);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
