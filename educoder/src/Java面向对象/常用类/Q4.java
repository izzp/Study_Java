package Java面向对象.常用类;

import java.util.Random;
import java.util.Scanner;

/**
 * 第4关：Random类
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/23
 */
public class Q4 {
    public static void main(String[] args) {
        // 定义一个字符型数组
        char[] pardStore = new char[62];
        // 把所有的大写字母放进去 把所有的小写字母放进去 把0到9放进去
        /********* Begin *********/
        for (int i = 0; i < 26; i++) {
            pardStore[i] = (char) ('A' + i);
        }
        for (int i = 26; i < 52; i++) {
            pardStore[i] = (char) ('a' + (i - 26));
        }
        for (int i = 52; i < 62; i++) {
            pardStore[i] = (char) ('0' + (i - 52));
        }
        /********* End *********/
        // 分别以1、2、3作为种子数 生成6位随机密码
        Scanner sc = new Scanner(System.in);
        int seed = sc.nextInt();
        /********* Begin *********/
        Random m = new Random(seed);
        for (int i = 0; i < 6; i++) {
            int n = m.nextInt(62);
            System.out.print(pardStore[n]);
        }
        /********* End *********/
    }
}