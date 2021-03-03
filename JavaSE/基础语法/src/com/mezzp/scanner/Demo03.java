package com.mezzp.scanner;

import java.util.Scanner;

/**
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/3
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据：");

        String str = scanner.nextLine();
        System.out.println("输入的内容为：" + str);

        scanner.close();
    }
}
