package Java入门.运算符和表达式;

import java.util.Scanner;

/**
 * 第2关：关系运算符
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/9
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        /*********start*********/
        System.out.println("a==b=" + (a == b));
        System.out.println("a!=b=" + (a != b));
        System.out.println("a>b=" + (a > b));
        System.out.println("a<b=" + (a < b));
        System.out.println("b>=a=" + (b > a));
        System.out.println("b<=a=" + (b < a));
        /*********end*********/
    }
}
