package StepikJava.ZaurJava.Course2.Lesson9.NIO.ChannelAndBuffer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class PathAndFilesExp2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("PathTestFile.txt");
        Path directoryPath = Paths.get("C:\\Users\\corys\\Desktop\\PathTestDirectory");

//        Files.copy(filePath, directoryPath.resolve(filePath));
//        System.out.println("Done!");

        System.out.println("------------------------------------------");


        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Done!");

        System.out.println("------------------------------------------");

        Path filePath2 = Paths.get("FileWriterExp.txt");
//        Files.move(filePath2, directoryPath.resolve(filePath2));
//        System.out.println("Done!");

        System.out.println("------------------------------------------");

//        Files.move(Paths.get("alphabet.txt"), Paths.get("newAlphabet.txt"));

        System.out.println("------------------------------------------");

        Files.delete(Paths.get("fhgbelilh.txt"));
    }
}



































