package Java高级特性.IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 第2关：字节流-输入输出
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/25
 */
public class Q2 {
    //仅内联代码，测试在平台

    public void task() throws IOException {
        /********* Begin *********/
        FileInputStream fs = new FileInputStream("src/step2/input/task.txt");
        byte[] b = new byte[8];
        fs.read(b);
        String str = new String(b);
        System.out.println(str);
        File dir = new File("src/step2/output/");
        if (!dir.exists()) {
            dir.mkdir();
        }
        FileOutputStream fos = new FileOutputStream("src/step2/output/output.txt");
        String out = "learning practice";
        byte[] outByte = out.getBytes();
        fos.write(outByte);
        fs.close();
        fos.close();
        /********* End *********/
    }
}
