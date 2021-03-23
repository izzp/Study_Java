package Java面向对象.常用类;

import java.util.Scanner;

/**
 * 第3关String&StringBuilder&StringBuffer类-练习
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/23
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // String substring(int start,int end)
        // 截取字符串，传入的两个参数分别为要截取边界的下标
        // 在java api 中,通常使用两个数字表示范围时,都是含头不含尾,即包含起始下标对应的内容,但不包含结束下标的处对应的内容
        // String toUpperCase() 将当前字符串中的英文部分转换为 全大写
        /********* Begin *********/
        StringBuilder s = new StringBuilder(str);
        s = new StringBuilder(s.substring(s.indexOf(".") + 1));
        s = new StringBuilder(s.substring(0, s.indexOf(".")));
        System.out.println(s);
        System.out.println(s.toString().toUpperCase());
        /********* End *********/
    }
}
