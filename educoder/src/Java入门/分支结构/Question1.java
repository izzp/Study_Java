package Java入门.分支结构;

import java.util.Scanner;

/**
 * 第1关：Java分支结构之 if...else
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/9
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /******start******/
        System.out.println("请输入学员成绩：");
        int sc = input.nextInt();
        if (sc >= 85 && sc <= 100) {
            System.out.println("优，非常棒！");
        } else {
            System.out.println("良，下次加油！");
        }
        /******end******/
    }
}
