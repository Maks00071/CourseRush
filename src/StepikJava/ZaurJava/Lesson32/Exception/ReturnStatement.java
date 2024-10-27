package StepikJava.ZaurJava.Lesson32.Exception;

import java.io.*;

public class ReturnStatement {
    public static void main(String[] args) {
        System.out.println(abc());
    }

    static int abc() {
        try {
            File file1 = new File("test.txt");
            FileInputStream fis = new FileInputStream(file1);
            return 5;
        } catch(FileNotFoundException e) {
            System.out.println("This is an exeption: " + e);
            e.printStackTrace();
            return -1;
        }
        finally {
            System.out.println("This is the block finally");
        }
    }
}
