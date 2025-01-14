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

            // channel -> buffer
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

            String text = "\nThere are only two ways to live your life." +
                    " One is as though nothing is a miracle." +
                    " The other is as though everything is a miracle.\n";

            // buffer -> channel

//            // создадим буфер
//            ByteBuffer byteBuffer = ByteBuffer.allocate(text.getBytes().length);
//            // кладем текст в буфер
//            byteBuffer.put(text.getBytes());
//            // переворачиваем буфер
//            byteBuffer.flip();
//            // записываем информацию в канал
//            channel.write(byteBuffer);

            // используем метод wrap
            ByteBuffer byteBuffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(byteBuffer2);


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
