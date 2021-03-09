package Java入门.运算符和表达式;

import java.util.Scanner;

/**
 * 第4关：三元运算符
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/9
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean result;
        /********start********/

        result=((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) ? true : false;

        System.out.println(year + "年是否为闰年:" + result);

        /********end********/
    }
}
