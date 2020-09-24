import org.junit.Test;
import sim.SimHash;
import sim.Formula;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author  RainZ
 * 开发过程测试
 */
public class DevTest {

    @Test
    public void SimHashTest() throws IOException {
        SimHash t1 = new SimHash("今天是星期天，天气晴，今天晚上我要去看电影");
        SimHash t2 = new SimHash("今天是周天，天气晴朗，我晚上要去看电影");
        int i = t1.hammingDistance(t2);
        System.out.println(Formula.getSimliar(i));
    }

    @Test
    public void mapTest(){
        Map<String, Integer> test = new HashMap<>();
        test.put("h",0);
        if(test.containsKey("h")){
            test.put("h",test.get("h")+1);
            System.out.println("here");
        }
        Integer h = test.get("h");
        System.out.println(h);
    }

    @Test
    public void charTest(){
        char s = '你';
        String s1 = String.valueOf(s);
        System.out.println(s1);
    }

    @Test
    public void stringTest(){
        String test = "你好世界";
        System.out.println(test.length());
    }
}
