package jp.gr.java_conf.pesk.bootcamp.exam4;

import java.util.Arrays;
import java.util.List;

public class Exam4Answer {

    public static void execute() {
        List<String> list = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
        
        String string = list.stream().skip(4).findFirst().map(s -> "[" + s + "]").get();
        System.out.println(string);
        
    }
}
