package Java面向对象.常用类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 第5关：Date类和SimpleDateFormat类的用法
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/23
 */
public class Q5 {
    public static void main(String[] args) throws ParseException {
        // 键盘录入你的出生年月日 格式为yyyy-MM-dd
        // 把该字符串转换为一个日期
        // 通过该日期得到一个毫秒值
        // 获取2020年10月1日的毫秒值
        // 两者想减得到一个毫秒值
        // 把该毫秒值转换为天 打印输出
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        /********* Begin *********/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse(line);
        long myTime = d1.getTime();
        Date d2 = sdf.parse("2020-10-01");
        long endTime = d2.getTime();
        long time = endTime - myTime;
        long day = time / 1000 / 60 / 60 / 24;
        System.out.println("你的出生日期距离2020年10月1日:" + day + "天");
        /********* End *********/
    }
}