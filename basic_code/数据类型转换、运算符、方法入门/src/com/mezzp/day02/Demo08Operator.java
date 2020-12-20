package com.mezzp.day02;

/**
 * @author zhaozhipeng
 * @version 1.0
 * @date 2020/12/20 14:57
 * FileName: Demo08Operator
 * Description: 比较运算符
 */
public class Demo08Operator {
    public static void main(String[] args) {
        System.out.println(10 > 5);
        //true
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 < num2);
        //true
        System.out.println(num2 >= 100);
        //false
        System.out.println(num2 <= 100);
        //true
        System.out.println("=======================");

        System.out.println(10 == 10);
        System.out.println(10 != 25);
        System.out.println(10 != 10);
        //不允许连写，跟数学不一样
    }
}
