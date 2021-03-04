package com.mezzp.struct;

/**
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/4
 */
public class ForDemo02 {
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            } else {
                evenSum += i;
            }
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
