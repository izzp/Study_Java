package Java面向对象.String类;

import java.util.Scanner;

/**
 * 第1关：length()方法与compareTo()方法的使用 - 花名册
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/23
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /********** Begin *********/
        String roster1 = new String(scanner.nextLine());
        String roster2 = new String(scanner.nextLine());
        System.out.println(roster1.length());
        System.out.println(roster2.length());
        if (roster1.compareTo(roster2) == 0) {
            System.out.println("相同");
        } else {
            System.out.println("不相同");
        }
        /********** End *********/
    }
}

