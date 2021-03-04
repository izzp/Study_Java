package com.mezzp.method;

/**
 * 方法
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/4
 */
public class Demo01 {
    public static void main(String[] args) {
        int sum = add(1, 2);
        System.out.println(sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
