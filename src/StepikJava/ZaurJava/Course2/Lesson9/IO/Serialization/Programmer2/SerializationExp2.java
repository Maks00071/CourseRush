package StepikJava.ZaurJava.Course2.Lesson9.IO.Serialization.Programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;


public class SerializationExp2 {
    public static void main(String[] args) {

        List<String> employeesTo;

        // выполняем десериализацию объекта
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employeesAll.bin"))
        ) {

            employeesTo = (ArrayList) inputStream.readObject();
            System.out.println(employeesTo); // [Maks, Ivan, Elena]

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
