package Java面向对象.Java中的异常;

import java.util.Scanner;

/**
 * 第2关：捕获异常
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/22
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        /********* Begin *********/

        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.print("除数不能为0");
        }


        /********* End *********/
    }

}

