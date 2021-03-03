package com.mezzp.scanner;

import java.util.Scanner;

/**
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/3
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        float f = 0.0f;
        System.out.println("请输入整数： ");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("整数为："+i);
        } else {
            System.out.println("不是整数");
        }


        System.out.println("请输入小数： ");
        if (scanner.hasNextFloat()) {
            f = scanner.nextFloat();
            System.out.println("小数为："+f);
        } else {
            System.out.println("不是小数");
        }


        scanner.close();
    }
}
