import cos.CosineSimilarity;
import sim.SimHash;
import sim.Formula;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author RainZ
 * 论文查重运行程序实现类
 */
public class Unit {
    static double ans(String path1, String path2) throws IOException {
        //        路径指定
        String filePath = path1;
        String comparePath = path2;

//        被比较文本与比较文本
        String text1 = new String();
        String text2 = new String();

//        文本输入
        BufferedReader in1 = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF8"));
        BufferedReader in2 = new BufferedReader(new InputStreamReader(new FileInputStream(comparePath), "UTF8"));
        String str;
        while ((str = in1.readLine()) != null) {
            text1 += str;
        }
        while ((str = in2.readLine()) != null) {
            text2 += str;
        }
        in1.close();
        in2.close();

        if (text1.length() == 0 || text2.length() == 0) {
            throw new CommonException("文本为空");
        }

        double ans;
        if (text1.length() > 3000) {
            SimHash hash1 = new SimHash(text1, 64);
            SimHash hash2 = new SimHash(text2, 64);
            int d = hash1.hammingDistance(hash2);
            ans = Formula.getSimliar(d);
        } else {
            ans = CosineSimilarity.getSimilarity(text1, text2);
        }
        return ans;

    }
}
