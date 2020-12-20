package com.mezzp.day02;

/**
 * @author zhaozhipeng
 * @version 1.0
 * @date 2020/12/20 14:42
 * FileName: Demo07Opertor
 * Description: 赋值运算符
 */
public class Demo07Operator {
    public static void main(String[] args) {
        int a = 10;
        a += 5;
        System.out.println(a);
        //15
        int x = 10;
        x %= 3;
        System.out.println(x);
        //1
        //只有变量可以使用赋值

        byte num = 30;
        num += 5;
        //int
        System.out.println(num);
        //隐含一个强制类型转换
    }
}
