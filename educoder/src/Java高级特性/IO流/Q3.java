package Java高级特性.IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 第3关：字符流 - 输入输出
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/26
 */
public class Q3 {
    //仅内联代码，测试在平台

    public void task() throws IOException {
        /********* Begin *********/
        String file1 = "src/step3/input/input.txt";
        FileReader fr = new FileReader(file1);
        char[] ch = new char[8];
        fr.read(ch);

        String file2 = "src/step3/output/output.txt";
        FileWriter fw = new FileWriter(file2);
        fw.write(ch);

        fr.close();
        fw.flush();
        fw.close();
        /********* End *********/
    }
}
