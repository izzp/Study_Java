package Java入门.数组基础;

import java.util.Scanner;

/**
 * 第2关：数组的使用
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/11
 */
public class Question2 {
    public static void main(String[] args) {
        /*******begin*******/
        //在这里定义一个长度为 4 的字符串数组，用来存放学生姓名
        String[] stuNames = new String[4];
        //在这里给stuNames数组赋值  分别为   张三,张无忌,张三丰,张岁山
        stuNames[0] = "张三";
        stuNames[1] = "张无忌";
        stuNames[2] = "张三丰";
        stuNames[3] = "张岁山";
        //在这里输出stuNames数组中的数据
        System.out.println("数组中的第一个数据为：" + stuNames[0]);
        System.out.println("数组中的第二个数据为：" + stuNames[1]);
        System.out.println("数组中的第三个数据为：" + stuNames[2]);
        System.out.println("数组中的第四个数据为：" + stuNames[3]);
        int[] scores;
        Scanner sc = new Scanner(System.in);
        //在这里获取系统输入的整数来初始化scores数组的长度
        int length = sc.nextInt();
        scores = new int[length];
        /*******end*******/
        System.out.println("数组scores的长度为：" + scores.length);
    }
}
