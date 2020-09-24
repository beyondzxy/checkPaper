import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author RainZ
 * 论文查重程序运行入口
 */
public class CheckPaperMain {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入论文原文路径：\n");
        String oriFilePath = checkFile(sc.nextLine());
        System.out.println("请输入抄袭版路径：\n");
        String copyFilePath = checkFile(sc.nextLine());
        System.out.println("请输入答案输出路径：\n");
        String answerFilePath = sc.nextLine() + "/answer.txt";
        File oriFile = new File(oriFilePath);
        File copyFile = new File(copyFilePath);
        double similarity = Unit.ans(oriFilePath, copyFilePath);
        String answer = copyFile.getName() + " 与文本 " + oriFile.getName() + " 相似度为：" + similarity;
        System.out.println(answer);
        File answerFile = new File(answerFilePath);
        try {
            if (!answerFile.exists()) {
                answerFile.createNewFile();
            }
            FileWriter fw = new FileWriter(answerFile);
            fw.write(answer);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new CommonException("输出答案文件异常！");
        }
    }

    private static String checkFile(String path) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        do {
            File file = new File(path);
            if (file.exists()) {
                return path;
            }
        } while (!flag);{
            System.out.println("文件不存在，请输入正确的路径：\n");
            String path1 = sc.nextLine();
            File file = new File(path1);
            if (file.exists()) {
                flag = true;
                path = path1;
            }
        }
        return path;
    }
}
