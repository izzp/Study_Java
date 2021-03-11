package Java入门.数组基础;

import java.util.Scanner;

/**
 * 第4关：数组练习-平均值和最大值
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/11
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[sc.nextInt()];

        //循环给数组赋值
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        /********** Begin **********/
        //在这里计算数组scores的平均值和最大值
        double avg;
        int sum = 0;
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (max < scores[i]) {
                max = scores[i];
            }
        }


        System.out.println("平均值：" + (double) sum / scores.length);
        System.out.println("最大值：" + max);
        /********** End **********/
    }
}
