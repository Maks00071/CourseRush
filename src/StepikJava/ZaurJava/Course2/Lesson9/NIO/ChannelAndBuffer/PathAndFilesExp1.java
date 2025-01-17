package StepikJava.ZaurJava.Course2.Lesson9.NIO.ChannelAndBuffer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;


public class PathAndFilesExp1 {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("randomAccess.txt");
        Path directoryPath = Paths.get("C:\\Users\\corys\\Desktop\\testFolderFile");

        System.out.println("filePath.getFileName(): " + filePath.getFileName());
        System.out.println("directoryPath.getFileName(): " + directoryPath.getFileName());
        /*
        filePath.getFileName(): randomAccess.txt
        directoryPath.getFileName(): testFolderFile
         */

        System.out.println("*************************************************");
        System.out.println("filePath.getParent(): " + filePath.getParent());
        System.out.println("directoryPath.getParent(): " + directoryPath.getParent());
        /*
        filePath.getParent(): null
        directoryPath.getParent(): C:\Users\corys\Desktop
         */
        System.out.println("*************************************************");
        System.out.println("filePath.getRoot(): " + filePath.getRoot());
        System.out.println("directoryPath.getRoot(): " + directoryPath.getRoot());
        /*
        filePath.getRoot(): null
        directoryPath.getRoot(): C:\
         */
        System.out.println("*************************************************");
        System.out.println(filePath.isAbsolute()); // false
        System.out.println(directoryPath.isAbsolute()); // true
        System.out.println("*************************************************");
        System.out.println(filePath.toAbsolutePath());
        System.out.println(directoryPath.toAbsolutePath());
        /*
        C:\Users\corys\IdeaProjects\CourseRush\randomAccess.txt
        C:\Users\corys\Desktop\testFolderFile
         */
        System.out.println("*************************************************");

        System.out.println(filePath.toAbsolutePath().getParent());
        System.out.println(filePath.toAbsolutePath().getRoot());
        /*
        C:\Users\corys\IdeaProjects\CourseRush
        C:\
         */
        System.out.println("*************************************************");
        System.out.println(directoryPath.resolve(filePath));
        System.out.println(filePath.resolve(directoryPath));
        /*
        C:\Users\corys\Desktop\testFolderFile\randomAccess.txt
        C:\Users\corys\Desktop\testFolderFile
         */
        System.out.println("*************************************************");

        Path filePath2 = Paths.get("PathTestFile.txt");
        Path directoryPath2 = Paths.get("C:\\Users\\corys\\Desktop\\PathTestDirectory");

        if (!Files.exists(filePath2)) {
            Files.createFile(filePath2);
            System.out.println("Файл создан!");
        }

        if (!Files.exists(directoryPath2)) {
            Files.createDirectory(directoryPath2);
            System.out.println("Директория создана!");
        }

        System.out.println("*************************************************");

        System.out.println(Files.getAttribute(filePath, "size")); // 487

        Map<String, Object> attributes = Files.readAttributes(filePath, "*");

        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            /*
            lastAccessTime : 2025-01-14T18:55:25.9331005Z
            lastModifiedTime : 2025-01-14T18:54:25.2049296Z
            size : 487
            creationTime : 2025-01-09T17:23:53.1176996Z
            isSymbolicLink : false
            isRegularFile : true
            fileKey : null
            isOther : false
            isDirectory : false
             */
        }
    }
}






































