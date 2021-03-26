package Java高级特性.IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 第4关：复制文件
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/26
 */
public class Q4 {
    //仅内联代码，测试在平台

    public void task() throws IOException {
        /********* Begin *********/
        String file1 = "src/step4/input/input.txt";
        FileInputStream fr = new FileInputStream(file1);
        byte[] b = new byte[1024];
        int len = 0;

        String file2 = "src/step4/output/output.txt";
        FileOutputStream fw = new FileOutputStream(file2);
        while ((len = fr.read(b)) != -1) {
            fw.write(b, 0, len);
        }
        fr.close();
        fw.close();

        String file3 = "src/step4/input/input.jpg";
        String file4 = "src/step4/output/output.jpg";
        FileInputStream fs = new FileInputStream(file3);   //定义文件输入流读取文件信息
        FileOutputStream fos = new FileOutputStream(file4);   //定义文件输出流写文件
        len = 0;   //每次读取数据的长度
        byte[] bys = new byte[1024];    //数据缓冲区
        while ((len = fs.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        //释放资源  刷新缓冲区
        fs.close();
        fos.close();
        /********* End *********/
    }
}
