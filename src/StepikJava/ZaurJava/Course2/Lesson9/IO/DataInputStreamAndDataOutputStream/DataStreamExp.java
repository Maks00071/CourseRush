package StepikJava.ZaurJava.Course2.Lesson9.IO.DataInputStreamAndDataOutputStream;

import java.io.*;


public class DataStreamExp {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin"));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("my_test.bin"));
             ) {
            // запишем примитивы в файл
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(5_000);
            outputStream.writeLong(1_000_000L);
            outputStream.writeFloat(3.14F);
            outputStream.writeDouble(125.254);

            System.out.println("Writing done!");

            // прочитаем информацию из файла
            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());

            System.out.println("Reading done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        Writing done!
        true
        5
        120
        5000
        1000000
        3.14
        125.254
        Reading done!
         */
    }
}
