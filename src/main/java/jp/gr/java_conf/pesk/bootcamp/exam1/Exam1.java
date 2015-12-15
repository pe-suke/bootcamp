package jp.gr.java_conf.pesk.bootcamp.exam1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam1 {
    
    public static void execute() {
        List<String> list = Arrays.asList("A001", "100", "-200", "ABC", "92");
        
        // ここより下の処理を書き換えて下さい。
        List<Integer> retList = new ArrayList<Integer>();
        for (String s : list) {
            if(s.matches("[-+]?\\d+")) {
                int i = Integer.parseInt(s);
                if (i > 0) {
                    retList.add(i * 3);
                }
            }
        }
        for (Integer i : retList) {
            System.out.println(i);
        }
        
    }
    
}
