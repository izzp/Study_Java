package Java面向对象.类与对象;

import java.util.Scanner;

/**
 * 第5关：类与对象练习
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/15
 */
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String theMa = sc.next();
        int quantity = sc.nextInt();
        boolean likeSoup = sc.nextBoolean();
        /********** Begin **********/
        //使用三个参数的构造方法创建WuMingFen对象  取名 f1
        WuMingFen f1 = new WuMingFen(theMa,quantity,likeSoup);
        //使用两个参数的构造方法创建WuMingFen对象  取名 f2
        WuMingFen f2 = new WuMingFen(theMa,quantity);
        //使用无参构造方法创建WuMingFen对象  取名 f3
        WuMingFen f3 = new WuMingFen();
        //分别调用三个类的 check方法
        f1.cheak();
        f2.cheak();
        f3.cheak();

        /********** End **********/
    }
}
