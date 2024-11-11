package StepikJava.ZaurJava.Course1.Lesson31.Exeptions;

import java.io.*;


public class ClassThrows {

    public void abc() throws FileNotFoundException {
        try {
            File file1 = new File("test.txt");
            FileInputStream fis = new FileInputStream(file1);
        } catch(FileNotFoundException e) {
            System.out.println("Exception: " + e);
            throw e;
        }
    }

    public void someMethod() {
        try {
            abc();
        } catch(FileNotFoundException e) {
            System.out.println("Исключение обработано!");
        }
    }

}
