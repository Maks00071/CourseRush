package Module1.Level24.Lesson.JavaNIOvsIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;


public class ClassByteBuffer {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
            RandomAccessFile accessFile = new RandomAccessFile(scanner.nextLine(), "rw");
            FileChannel channel = accessFile.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(100);
            int bytesRead = channel.read(buffer);
            while (bytesRead != -1) {   //пока буфер не пустой
                System.out.println("Read " + bytesRead);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.println((char) buffer.get());
                }
                buffer.clear();
                bytesRead = channel.read(buffer);
            }

        } catch (IOException ex) {
            System.out.println(ex.getStackTrace());
        }
    }
}
