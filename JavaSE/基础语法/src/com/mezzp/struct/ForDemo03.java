package com.mezzp.struct;

/**
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/4
 */
public class ForDemo03 {
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}
