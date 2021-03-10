package Java入门.方法的使用;

import java.util.Scanner;

/**
 * 第3关： 掌握有参数无返回值方法的调用
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/10
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score1 = sc.nextInt(); //第一门成绩
        int score2 = sc.nextInt(); //第二门成绩
        /********** Begin **********/
        // 调用方法，传入两门课程的成绩
        calcAvg(score1, score2);
        /********** End **********/
    }

    /*
     * 功能：计算两门课程考试成绩的平均分并输出平均分
     * 定义一个包含两个参数的方法，用来传入两门课程的成绩
     */

    /********** Begin **********/
    public static void calcAvg(double a, double b) {
        System.out.println("平均分：" + (int) (a + b) / 2);
    }

    /********** End **********/
}
