package StepikJava.ZaurJava.Course2.Lesson9.File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("FileWriterExp.txt");
        File folder = new File("C:\\Users\\corys\\Desktop\\hse");

        // вывести абсолютный путь файла/директории
        System.out.println("file.getAbsolutePath(): " + file.getAbsolutePath());
        // "file.getAbsolutePath(): C:\Users\corys\IdeaProjects\CourseRush\FileWriterExp.txt"
        System.out.println("folder.getAbsolutePath(): " + folder.getAbsolutePath());
        // "folder.getAbsolutePath(): C:\Users\corys\Desktop\hse"

        System.out.println("--------------------------------------------");

        // абсолютный ли путь у файла/директории
        System.out.println("file.isAbsolute(): " + file.isAbsolute());
        // "file.isAbsolute(): false"
        System.out.println("folder.isAbsolute(): " + folder.isAbsolute());
        // "folder.isAbsolute(): true"

        System.out.println("--------------------------------------------");

        // является ли файл директорией
        System.out.println("file.isDirectory(): " + file.isDirectory());
        // "file.isDirectory(): false"
        System.out.println("folder.isDirectory(): " + folder.isDirectory());
        // "folder.isDirectory(): true"

        System.out.println("--------------------------------------------");

        // существует ли файл/директория
        System.out.println("file.exists(): " + file.exists());
        // file.exists(): true
        System.out.println("folder.exists(): " + folder.exists());
        // folder.exists(): true

        System.out.println("--------------------------------------------");

        // создание нового файла/директории
        File file2 = new File("testFile.txt");
        System.out.println(file2.createNewFile());

        File folder2 = new File("C:\\Users\\corys\\Desktop\\testFolder");
        System.out.println(folder2.mkdir());

        File folder3 = new File("C:\\Users\\corys\\Desktop\\testFolderFile");
        System.out.println(folder3.mkdir());

        System.out.println("--------------------------------------------");

        // посмотреть размер файла в байтах
        System.out.println("file.length(): " + file.length());
        // "file.length(): 294"
        System.out.println("folder.length(): " + folder.length());
        // "folder.length(): 4096"

        System.out.println("--------------------------------------------");

        System.out.println("file2.delete(): " + file2.delete());
        System.out.println("folder2.delete(): " + folder2.delete());

        System.out.println("--------------------------------------------");

        File[] listFiles = folder3.listFiles();
        System.out.println(Arrays.toString(listFiles));
        // "[C:\Users\corys\Desktop\testFolderFile\A, C:\Users\corys\Desktop\testFolderFile\test.txt]"

        System.out.println("--------------------------------------------");


    }
}




































