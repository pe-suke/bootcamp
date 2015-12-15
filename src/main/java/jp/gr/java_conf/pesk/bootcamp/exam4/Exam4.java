package jp.gr.java_conf.pesk.bootcamp.exam4;

import java.util.Arrays;
import java.util.List;

public class Exam4 {

    public static void execute() {
        List<String> list = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
        
        for (int i = 0; i < list.size(); i++) {
            if (i == 4) {
                System.out.println("[" +list.get(i) + "]");
            }
        }
        
    }
    
}
