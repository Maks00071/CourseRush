package StepikJava.ZaurJava.Course2.Lesson9.IO.BufferedReaderAndBufferedWriter;

import java.io.*;


public class CopyExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("FileWriterExp.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("FileExp2.txt"));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write('\n');
            }
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
