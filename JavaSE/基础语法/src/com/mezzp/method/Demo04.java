package com.mezzp.method;

/**
 * 可变参数
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/4
 */
public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(1, 2, 3, 4);
    }

    public void test(int... i) {
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
    }
}