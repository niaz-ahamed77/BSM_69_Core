package java11Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileDemo {
    public static void main(String[] args) throws IOException{
        var path = "C:\\Users\\Aquinox\\Desktop\\data.txt";
        Files.writeString(Path.of(path), "Welcome to Cogent", StandardOpenOption.CREATE);
        String result = Files.readString(Path.of(path));
        System.out.println(result);
    }
}


