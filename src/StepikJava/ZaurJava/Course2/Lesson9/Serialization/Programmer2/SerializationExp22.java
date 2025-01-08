package StepikJava.ZaurJava.Course2.Lesson9.Serialization.Programmer2;

import StepikJava.ZaurJava.Course2.Lesson9.Serialization.Programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationExp22 {
    public static void main(String[] args) {
        Employee employee;

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("EmployeeMaria.bin"))
        ) {

            employee = (Employee) inputStream.readObject();
            System.out.println(employee);
            // Employee{name='Maria', department='IT', age=28, salary=500.75}
            // добавим работнику автомобиль
            // Employee{name='Maria', department='IT', age=28, salary=500.75, car=Car{model='BMW', color='red'}}
            // скроем персональные данные по зарплате
            // Employee{name='Maria', department='IT', age=28, salary=0.0, car=Car{model='BMW', color='red'}}
            // добавим фамилию
            // Employee{name='Maria', surname='Ivanova', department='IT', age=28, salary=0.0, car=Car{model='BMW', color='red'}}

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
