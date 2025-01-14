package StepikJava.ZaurJava.Course2.Lesson9.NIO.ChannelAndBuffer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


public class ChannelBufferExp {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("randomAccess.txt", "rw");
             FileChannel channel = file.getChannel();
        ) {

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stringBuilder = new StringBuilder();

            // канал читает в буфер
            int byteRead = channel.read(buffer);

            while (byteRead > 0) {
                System.out.println("Количество прочитанных байт " + byteRead);

                buffer.flip();

                while (buffer.hasRemaining()) {
                    stringBuilder.append((char) buffer.get());
                }

                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(stringBuilder);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        Количество прочитанных байт 25
        Количество прочитанных байт 25
        Количество прочитанных байт 25
        Количество прочитанных байт 25
        Количество прочитанных байт 25
        Количество прочитанных байт 25
        Количество прочитанных байт 25
        Количество прочитанных байт 25
        Количество прочитанных байт 25
        Количество прочитанных байт 25
        Количество прочитанных байт 25
        Количество прочитанных байт 25
        Количество прочитанных байт 25
        Количество прочитанных байт 25
        Количество прочитанных байт 3
        Had I the heavens' embroidered cloths
        Enwrought with golden and silver light,
        The blue and the dim and the dark cloths
        Of night and light and the half-light,
        I would spread the cloths under your feet:
        But I, being poor, have only my dreams;
        I have spread my dreams under your feet;
        Tread softly because you tread on my dreams.
                        William Butler
         */
    }
}
