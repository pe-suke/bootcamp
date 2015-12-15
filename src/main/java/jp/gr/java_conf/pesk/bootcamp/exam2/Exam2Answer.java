package jp.gr.java_conf.pesk.bootcamp.exam2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Exam2Answer {

    public static void execute() {
        String pathStr = Exam2.class.getClassLoader().getResource("inputFile.txt").getPath();
        Path path = new File(pathStr).toPath();
        
        try(Stream<String> stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
