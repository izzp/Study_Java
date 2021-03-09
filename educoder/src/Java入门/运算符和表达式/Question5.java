package Java入门.运算符和表达式;

import java.util.Scanner;

/**
 * 第5关：运算符的优先级
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/9
 */
public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入：");
        int m=sc.nextInt();
        int n=sc.nextInt();

        System.out.println("输出：");

        /*****start*****/

        System.out.println( (m+n)*2 );

        System.out.println( (m-n)%3 );

        System.out.println((m-n)/2 + (m+n)*2);

        /*****end*****/
    }
}
