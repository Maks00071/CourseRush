package StepikJava.ZaurJava.Course2.Lesson9.Serialization.Programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExp12 {
    public static void main(String[] args) {

        Car car = new Car("BMW", "red");
        Employee employee1 = new Employee("Maria", "Ivanova","IT", 28, 500.75, car);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("EmployeeMaria.bin"))
        ) {

            outputStream.writeObject(employee1);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
