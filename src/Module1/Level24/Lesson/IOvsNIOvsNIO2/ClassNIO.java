package Module1.Level24.Lesson.IOvsNIOvsNIO2;

import java.io.*;
import java.nio.channels.FileChannel;


/**
 * Проверим время копирования маленького файла (до 10 Мб) через NIO
 */

public class ClassNIO {
    public static void main(String[] args) {
        long currentMills = System.currentTimeMillis();
        long startMills = currentMills;

        File src = new File("C:\\Users\\maksim.korystov\\Documents\\file_test.txt");
        File dst = new File("C:\\Users\\maksim.korystov\\Documents\\file_testNIO.txt");

        // копия nio
        copyFileByChannel(src, dst);
        currentMills = System.currentTimeMillis();
        System.out.println("Время выполнения в миллисекундах: " + (currentMills - startMills));  //=> Время выполнения в миллисекундах: 14

    }

    /**
     * Метод копирует данные из файла-источника в файл-приемник посредством каналов чтения/записи
     * @param src_path - путь до источника
     * @param dst_path - путь до целевого файла
     */
    public static void copyFileByChannel(File src_path, File dst_path) {
        // 1. Получаем FileChannel исходного файла и целевого файла
        try (FileChannel srcFileChannel = new FileInputStream(src_path).getChannel();
            FileChannel dstFileChannel = new FileOutputStream(dst_path).getChannel()) {

            // 2. Размер текущего FileChannel
            long count = srcFileChannel.size();

            while (count > 0) {

                /**=============================================================
                 * 3. Записать байты из FileChannel исходного файла в целевой FileChannel:
                 * 3.1 srcFileChannel.position (): начальная позиция в исходном файле не может быть отрицательной
                 * 3.2 count: максимальное количество переданных байтов, не может быть отрицательным
                 * 3.3 dstFileChannel: целевой файл
                 *==============================================================*/
                long transferred = srcFileChannel.transferTo(srcFileChannel.position(), count, dstFileChannel);

                // 4. После завершения переноса измените положение исходного файла на новое место
                srcFileChannel.position(srcFileChannel.position() + transferred);

                // 5. Рассчитаем, сколько байтов осталось перенести
                count -= transferred;
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
























