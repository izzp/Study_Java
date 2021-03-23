package Java面向对象.String类;

import java.util.Scanner;

/**
 * 第2关：substring()方法与indexOf()方法的使用 - 姓名查找
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/23
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /********** Begin *********/
        String data = scanner.next();
        String name = scanner.next();
        int i = 0, str = 0;
        while (i <= data.length()) {
            str = data.indexOf(name, i);
            if (str != -1) {
                System.out.println(str);
                i = str + 1;
            } else {
                i++;
            }
        }
        /********** End *********/
    }
}
