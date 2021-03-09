package Java入门.运算符和表达式;

import java.util.Scanner;

/**
 * 第3关：逻辑运算符
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/9
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();
        boolean c = sc.nextBoolean();

        /*********start  *********/

        System.out.println(!a);

        System.out.println(a && b);

        System.out.println(c || b);

        System.out.println(a || c);
        /*********end  *********/
    }
}
