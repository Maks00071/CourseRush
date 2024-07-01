package Module1.Level24.Lesson.JavaNIOvsIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class ClassJavaNIO {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("C:\\Users\\maksim.korystov\\Documents\\result.txt", "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(100);
        int bytesRead = fileChannel.read(buffer);

        while (bytesRead != -1) {
            System.out.println("Read " + bytesRead);
            buffer.flip();

            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }

            buffer.clear();
            bytesRead = fileChannel.read(buffer);
        }
        randomAccessFile.close();
    }
}
