package com.mezzp.struct;

/**
 * 三角形
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/4
 */
public class TestDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
