package Module1.Level21;

import java.io.FileOutputStream;
import java.io.IOException;


public class TryWithResources {
    //можно написать короче, чем:
//    static FileOutputStream output = null;
//
//    public static void main(String[] args) throws Exception {
//
//        String path = "C:\\Users\\maksim.korystov\\Desktop\\test.txt";
//
//        try {
//            output = new FileOutputStream(path);
//            output.write(1);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (output == null) {
//                output.close();
//            }
//        }
//    }

    // это оператор try-with-resources:
    public static void main(String[] args) {
        String path = "C:\\Users\\maksim.korystov\\Desktop\\test.txt";

        try (FileOutputStream output = new FileOutputStream(path)) {
            output.write(123);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}






















