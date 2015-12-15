package jp.gr.java_conf.pesk.bootcamp.exam2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exam2 {

    public static void execute() {
        BufferedReader br = null;
        String pathStr = Exam2.class.getClassLoader().getResource("inputFile.txt").getPath();
        Path path = new File(pathStr).toPath();
        
        // ここより下の処理を書き換えて下さい
        try {
            br = Files.newBufferedReader(path);
            
            String str;
            while((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
                
            }
        }
        
    }
}
