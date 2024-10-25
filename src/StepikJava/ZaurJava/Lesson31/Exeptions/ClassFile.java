package StepikJava.ZaurJava.Lesson31.Exeptions;

import java.io.*;


public class ClassFile {
    public static void main(String[] args) throws Exception {
        // абстракная репрезентация - "pathname" не проверяется - exception не возникает
        File file1 = new File("test.txt");
        FileInputStream fis = new FileInputStream(file1); // Exception in thread "main" java.io.FileNotFoundException
        fis.read();

        FileOutputStream fos = new FileOutputStream(file1); // Exception in thread "main" java.io.FileNotFoundException
        fos.write("Hello".getBytes());
    }
}
