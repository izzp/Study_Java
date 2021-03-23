package Java面向对象.String类;

import java.util.Scanner;

/**
 * 第3关：String串类操作 - 文件名与邮箱验证
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/23
 */
public class Q3 {

    public void judge(String fileName, String email) {
        //请在此添加实现代码
        /********** Begin **********/
        String last1 = "1";
        String last2 = "2";
        String last3 = "3";
        String last4 = "4";
        int i1 = fileName.length();
        if (i1 <= 5) {
            System.out.println("Java文件名无效");
        } else {
            last1 = ".java";
            last2 = fileName.substring(i1 - 5, i1);
        }
        if (last1.equals(last2)) {
            System.out.println("Java文件名正确");
        } else if (i1 > 5) {
            System.out.println("Java文件名无效");
        }
        int o1 = email.lastIndexOf("@");
        int o2 = email.lastIndexOf(".");
        int i2 = email.length();
        if (i2 <= 4) {
            System.out.println("邮箱名无效");
        } else {
            last3 = ".com";
            last4 = email.substring(i2 - 4, i2);
        }
        if ((o1 < o2) && last3.equals(last4)) {
            System.out.println("邮箱名正确");
        } else if (i2 > 4) {
            System.out.println("邮箱名无效");
        }
        /********** End **********/
    }

    public static void main(String[] args) {
        Q3 helloWorld = new Q3();
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        String email = sc.next();
        helloWorld.judge(fileName, email);
    }

}