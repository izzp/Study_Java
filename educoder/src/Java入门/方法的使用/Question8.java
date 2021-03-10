package Java入门.方法的使用;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 第8关：方法通关挑战
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/10
 */
public class Question8 {
    /********** Begin **********/
    /**
     * 第一题：定义一个方法 接收两个整数类型的参数 a和b，返回两个数的和  返回值类型为int 方法名为：getSum
     */
    public static int getSum(int a, int b) {
        return a + b;
    }

    /**
     * 第二题： 定义一个方法 接收三个double类型参数a，b，c， 返回这三个数的平均值 返回值类型为double 方法名为：getAvg
     */
    public static double getAvg(double a, double b, double c) {
        double s = a + b + c;
        return s / 3;
    }

    /**
     * 第三题： 定义一个方法 接收两个参数 a 和b 打印a行 b列的一个矩形  不需要返回值   方法名为：printRect
     */
    public static void printRect(int a, int b) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /**
     * 第四题：定以一个方法，接收整形数组 为参数  对这个数组进行升序排序  最后输出该数组 不需要返回值 方法名为 sortArr
     */
    public static void sortArr(int [] arr){
        Arrays.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }

    /**
     * 第五题
     * 你只需要实现for 循环括号的内容就可 ，打印语句系统已经给你完成
     */
    public static void Print99() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }

    /********** End **********/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //分别调用四个方法
        System.out.println(getSum(sc.nextInt(),sc.nextInt()));;

        System.out.println(getAvg(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));;

        printRect(sc.nextInt(), sc.nextInt());

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sortArr(arr);

        Print99();
    }
}
