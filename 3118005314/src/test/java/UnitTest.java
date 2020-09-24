import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author  RainZ
 * 最终项目测试
 */
public class UnitTest {

    /**
     * 测试给出的示例原本
     */
    @Test
    public void simTest() throws IOException {
        File folder = new File("/Users/rainz/课内课程/软件工程/3118005314/src/TestFile/sim_0.8");
        File[] files = folder.listFiles();
        for(File file:files){
            if(file == files[0]){
                continue;
            }
            System.out.println(files[0].getName()+" 与文本 " + file.getName() + "的相似度为：" + Unit.ans(files[0].getPath(),file.getPath()));
            System.out.println("-----------------------------");
        }
    }

    /**
     * 文本比较（使用余弦相似度算法）
     */
    @Test
    public void CosTest() throws IOException {
        File folder = new File("/Users/rainz/课内课程/软件工程/3118005314/src/TestFile/costest");
        File[] files = folder.listFiles();
        for(File file:files){
            if(file == files[0]){
                continue;
            }
            System.out.println(files[0].getName()+" 与文本 " + file.getName() + "的相似度为：" +Unit.ans(files[0].getPath(),file.getPath()));
            System.out.println("-----------------------------");
        }
    }

    /**
     * 特殊文本比较
     * 空文本
     */
    @Test
    public void esTest1() throws IOException {
        System.out.println(Unit.ans("/Users/rainz/课内课程/软件工程/3118005314/src/TestFile/estest/a_orig.txt","/Users/rainz/课内课程/软件工程/3118005314/src/TestFile/estest/blank.txt"));
    }

}
