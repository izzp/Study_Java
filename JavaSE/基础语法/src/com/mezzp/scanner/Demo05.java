package com.mezzp.scanner;

import java.util.Scanner;

/**
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/3
 */
public class Demo05 {
    public static void main(String[] args) {
        //输入多个数字，求和和平均数，一个数字一回车，输入非数字结束
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m++;
            sum +=x;
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均数为"+(sum/m));


        scanner.close();
    }
}
