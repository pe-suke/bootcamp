package jp.gr.java_conf.pesk.bootcamp.exam3;

import java.util.Optional;
import java.util.Random;

public class Exam3Answer {

    public static void execute() {
        System.out.println(getNullable().orElse("ぬるぽ"));
    }
    
    public static Optional<String> getNullable() {
        Random random = new Random();
        int nextInt = random.nextInt(10);
        
        String retStr = null;
        
        if (nextInt > 3) {
            retStr = "test";
        }
        
        return Optional.ofNullable(retStr);
    }
}
