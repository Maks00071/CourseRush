package StepikJava.ZaurJava.Lesson31.Exeptions;

import java.io.*;

public class CheckedException {

    public void abc() {
        File file1 = new File("test.txt");

        try {
            FileInputStream fis = new FileInputStream(file1);
        } catch(FileNotFoundException e) {
            System.out.println("This is an exception: " + e);
            e.getStackTrace();
        }
    }

    public void abcWithCheck() throws FileNotFoundException {
        File file2 = new File("test.txt");
        FileInputStream fis = new FileInputStream(file2);
    }

    public void printName(String name) throws FileNotFoundException {
        System.out.println("Hello " + name);
        abc();
        abcWithCheck();


    }

    public static void main(String[] args){
        CheckedException ched = new CheckedException();
        try {
            ched.printName("Ivan");
        } catch(FileNotFoundException e) {
            System.out.println("The Exception will catch!");
            e.printStackTrace();
        }
    }
}
