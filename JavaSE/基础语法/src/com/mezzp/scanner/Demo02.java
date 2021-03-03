package com.mezzp.scanner;

import java.util.Scanner;

/**
 * 输入
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/3
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine方式接收");


        if (scanner.hasNextLine()) {
            //使用nextLine方式接收
            String str = scanner.nextLine();
            System.out.println("输入的内容为" + str);
        }
        scanner.close();
    }
}
