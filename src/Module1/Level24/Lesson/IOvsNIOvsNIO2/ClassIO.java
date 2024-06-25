package Module1.Level24.Lesson.IOvsNIOvsNIO2;

import java.io.*;


/**
 * Напишем код, который будет копировать наш файл из одной папки в другую.
 * Проверим его работу на маленьком и большом файлах.
 */

public class ClassIO {
    public static void main(String[] args) {
        //время старта
        long currentMills = System.currentTimeMillis();
        long startMills = currentMills;
        File src = new File("C:\\Users\\maksim.korystov\\Documents\\file_test.txt");
        File dst = new File("C:\\Users\\maksim.korystov\\Documents\\file_testIO.txt");
        copyFileByIO(src, dst);
        //время останова
        currentMills = System.currentTimeMillis();
        System.out.println("Время выполнения в миллисекундах: " + (currentMills - startMills)); //=> Время выполнения в миллисекундах: 9
    }

    /**
     * Метод копирует данные из файла-источника в файл_приемник
     * @param src_path - путь до источника
     * @param dst_path - путь до целевого файла
     */
    public static void copyFileByIO(File src_path, File dst_path) {
        try (InputStream inputStream = new FileInputStream(src_path);
             OutputStream outputStream = new FileOutputStream(dst_path)) {

            byte[] buffer = new byte[1024];
            int length;

            // Читаем данные в байтовый массив, а затем выводим в OutStream
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}


















