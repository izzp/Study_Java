package com.mezzp.day02;

/**
 * @author zzp
 * @version 1.0
 * @date 2020/8/10 20:09
 * FileName: Demo01DataType
 * Description: 自动数据类型转换
 */
public class Demo01DataType {
    public static void main(String[] args) {
        System.out.println(1024);
        // 这就是一个整数，默认就是int类型
        System.out.println(3.14);
        // 这就是一个浮点数，默认就是double类型

        // 左边是long类型，右边是默认的int类型，左右不一样
        // 一个等号代表赋值，将右侧的int常量，交给左侧的long变量进行存储
        // int --> long，符合了数据范围从小到大的要求
        // 发生了自动类型转换。
        long num1 = 100;
        System.out.println(num1);
        // 100

        // 左边是float类型，右边是long类型，左右不一样
        // long --> float，范围是float更大一些
        // 也发生了自动类型转换
        float num3 = 30L;
        System.out.println(num3);
        // 30.0
    }
}
