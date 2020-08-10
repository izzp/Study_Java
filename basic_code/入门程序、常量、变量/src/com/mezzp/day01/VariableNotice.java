package com.mezzp.day01;

/**
 * @author zzp
 * @version 1.0
 * @date 2020/8/10 19:44
 * FileName: VariableNotice
 * Description: 变量注意事项
 */
public class VariableNotice {
    public static void main(String[] args) {
        int num1 = 10;
        //变量之间的名称不可以重复

        int num2 = 20;

        int num3;
        num3 = 30;

        int num4; // 定义了一个变量，但是没有进行赋值
        // System.out.println(num4); // 直接使用打印输出就是错误的！

        // System.out.println(num5); // 在创建变量之前，不能使用这个变量

        int num5 = 500;
        System.out.println(num5);
        // 500

        {
            int num6 = 60;
            System.out.println(num6);
            // 60
        }
        // int num6;
        // System.out.println(num6); // 已经超出了大括号的范围，超出了作用域，变量不能再使用了

        // 同时创建了三个全都是int类型的变量
        int a, b, c;
        // 各自分别赋值
        a = 10;
        b = 20;
        c = 30;

        // 同时创建三个int变量，并且同时各自赋值
        int x = 100, y = 200, z = 300;
        System.out.println(a +" "+ b +" "+ c +" "+ x +" "+ y +" "+ z);
        //输出多个变量
    }
}
