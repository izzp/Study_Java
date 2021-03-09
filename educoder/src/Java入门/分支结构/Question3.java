package Java入门.分支结构;

import java.util.Scanner;

/**
 * 第3关：Java分支结构之多重if
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/9
 */
public class Question3 {
    public static void main(String[] args) {
        System.out.println("星级成绩评定系统");
        System.out.println("请输入成绩：");
        Scanner sc = new Scanner(System.in);
        /******start******/
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("*****五星成绩");
        } else if (score >= 80 && score < 90) {
            System.out.println("****四星成绩");
        } else if (score >= 70 && score < 80) {
            System.out.println("***三星成绩");
        } else if (score >= 60 && score < 70) {
            System.out.println("**俩星成绩");
        } else {
            System.out.println("无星成绩");
        }
        /******end******/
    }
}
