package com.mezzp.base;

/**
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/2
 */
public class Demo2 {
    public static void main(String[] args) {
        int num1 = 10;
        byte num2 = 20;
        short num3 = 30;
        long num4 = 30L;

        float num5 = 50.1F;
        double num6 = 3.1415926;
        //BigDecimal

        char name = 'a';
        //String不是关键字
        //String namea = "啊哈哈";

        boolean flag = true;

        //============================================
        String sa = new String("Hello world");
        String sb = new String("Hello world");
        System.out.println(sa == sb);
        String sc = "hello";
        String sd = "hello";
        System.out.println(sc == sd);

        int a=10_0000_0000;

    }
}
