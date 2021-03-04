package com.mezzp.struct;

/**
 * 增强for循环
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/4
 */
public class ForDemo04 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("---------------------------");
        for (int x : numbers) {
            System.out.println(x);
        }
    }
}
