package Java入门.方法的使用;

import java.util.Scanner;

/**
 * 第4关：掌握有参数有返回值方法的调用
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/10
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();   //获取第一个输入的整数
        int j = sc.nextInt();    //获取第二个输入的整数

        /********** Begin **********/
        //在这里调用方法获取返回值
        int max = 0;
        max = getMax(i, j);
        System.out.println(i + "和" + j + "比较，最大值是：" + max);
        /********** End **********/
    }
    /*在这里创建getMax方法，以两个整数作为参数，返回两个整数中较大的值*/

    /********** Begin **********/
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

        /********** End **********/
    }
}
