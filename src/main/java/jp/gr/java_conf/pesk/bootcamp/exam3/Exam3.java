package jp.gr.java_conf.pesk.bootcamp.exam3;

import java.util.Random;

public class Exam3 {
    
    public static void execute() {
        String str = getNullable();
        
        if (str != null) {
            System.out.println(str);
        } else {
            System.out.println("ぬるぽ");
        }
        
    }
    
    public static String getNullable() {
        Random random = new Random();
        int nextInt = random.nextInt(10);
        
        String retStr = null;
        
        if (nextInt > 3) {
            retStr = "test";
        }
        
        return retStr;
    }
    
}
