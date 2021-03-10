package Java入门.循环结构基础;

import java.util.Scanner;

/**
 * 第7关：Java循环结构之for循环
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/10
 */
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请给定一个自然数N：");
        int N = sc.nextInt();//获取输入的整数N
        int sum = 1;
        /*****start*****/
        for (int i = 1; i <= N; i++) {
            sum = i * sum;
        }


        /*****end*****/

        System.out.println("自然数N的阶乘为" + sum);
    }
}
