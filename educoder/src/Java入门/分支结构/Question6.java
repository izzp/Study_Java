package Java入门.分支结构;

import java.util.Scanner;

/**
 * 第6关：来吧，我是BOSS！
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/9
 */
public class Question6 {
    final static Scanner sc = new Scanner(System.in);    //创建扫描仪

    //第一题
    public static void first() {
        System.out.println("请输入人数：");
        int input = sc.nextInt();        //获取输入的数据

        /*****start*****/
        if (input < 10) {
            System.out.println("打半场");
        } else {
            System.out.println("打全场");
        }
        /*****end*****/
    }

    //第二题
    public  static void second() {
        System.out.println("请输入今天星期几：");
        int input = sc.nextInt();        //获取输入的数据

        /*****start*****/
        if (input == 1) {
            System.out.println("今天吃米饭");
        } else if (input == 2) {
            System.out.println("今天吃牛排");
        } else if (input == 3) {
            System.out.println("今天吃鸡排");
        } else {
            System.out.println("今天吃红烧肉");
        }
        /*****end*****/
    }

    //第三题
    public static void third() {
        System.out.println("请输入今天星期几：");
        int input = sc.nextInt();        //获取输入的数据

        /*****start*****/
        switch (input) {
            case 1:
                System.out.println("今天吃米饭");
                break;
            case 2:
                System.out.println("今天吃牛排");
                break;
            case 3:
                System.out.println("今天吃鸡排");
                break;
            default:
                System.out.println("今天吃红烧肉");
                break;
        }
        /*****end*****/
    }

    public static void main(String[] args) {
        first();
        second();
        third();
    }
}
