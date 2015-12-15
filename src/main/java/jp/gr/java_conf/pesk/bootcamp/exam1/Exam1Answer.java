package jp.gr.java_conf.pesk.bootcamp.exam1;

import java.util.Arrays;
import java.util.List;

public class Exam1Answer {

    public static void execute() {
        List<String> list = Arrays.asList("A001", "100", "-200", "ABC", "92");
        
        list.stream()
            .filter(s -> s.matches("[-+]?\\d+"))
            .map(Integer::parseInt)
            .filter(i -> i > 0)
            .map(i -> i*3)
            .forEach(System.out::println);;
        
    }
    
}
