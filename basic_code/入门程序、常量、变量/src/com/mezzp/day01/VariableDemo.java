package com.mezzp.day01;

/**
 * @author zzp
 * @version 1.0
 * @date 2020/8/10 19:36
 * FileName: VariableDemo
 * Description: 变量Demo
 */
public class VariableDemo {
    public static void main(String[] args) {

        int num1;
        num1 = 10;
        System.out.println(num1);

        num1 = 20;
        System.out.println(num1);

        int num2 = 25;
        System.out.println(num2);
        // 25

        num2 = 35;
        System.out.println(num2);
        // 35
        System.out.println("===============");

        byte num3 = 30;
        // 注：右侧数值的范围不能超过左侧数据类型的取值范围
        System.out.println(num3);
        //30

        short num5 = 50;
        System.out.println(num5);
        // 50

        long num6 = 3000000000L;
        System.out.println(num6);
        // 3000000000

        float num7 = 2.5F;
        System.out.println(num7);
        // 2.5

        double num8 = 1.2;
        System.out.println(num8);
        // 1.2

        char zifu1 = 'A';
        System.out.println(zifu1);
        // A

        zifu1 = '中';
        System.out.println(zifu1);
        // 中

        boolean var1 = true;
        System.out.println(var1);
        // true
        //boolean bool类型

        var1 = false;
        System.out.println(var1);
        // false

        boolean var2 = var1;
        System.out.println(var2);
        // false
    }
}
