package StepikJava.ZaurJava.Course2.Lesson9.NIO.ChannelAndBuffer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class PathAndFilesExp3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("testPath3.txt");
//        Files.createFile(filePath);

        String dialog = """
                - Hello!
                - Hello!
                - How are You?
                - I'm fine. Thanks! what about You?
                - I'm fine too!
                """;

//        Files.write(filePath, dialog.getBytes());

        List<String> list = Files.readAllLines(filePath);

        for (String str : list) {
            System.out.println(str);
        }

    }
}
