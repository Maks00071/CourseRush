package StepikJava.ZaurJava.Course2.Lesson9.RandomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomAccessFileExp {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("randomAccess.txt", "rw")
        ) {
//            int letter = file.read();
//            System.out.println((char) letter);  // 'H'

            // прочитаем строку
//            String str = file.readLine();
//            System.out.println(str);
            // "Had I the heavens' embroidered cloths"

            // выведем строку с определенной позиции
            file.seek(101); // перемещаем курсор
            String strPosition = file.readLine();
            System.out.println(strPosition);  // "and the dark cloths"

            long positionPointer = file.getFilePointer();
            System.out.println(positionPointer); // 122

            file.seek(file.length());
            file.writeBytes("\n\t\t\t\t\tWilliam Butler");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
