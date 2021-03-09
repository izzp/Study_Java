package Java入门.变量与数据类型;

import java.util.Scanner;

/**
 * 第7关：Scanner的使用
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/9
 */
public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请录入嫦娥个人信息：");
        System.out.println("请输入姓名：");
        String name = input.next();
        System.out.println("请输入年龄：");
        String age = input.next();
        System.out.println("请输入性别：");
        String sex = input.next();
        System.out.println("请输入体重：");
        String weight = input.next();
        System.out.println("请输入地址：");
        String place = input.next();
        System.out.println("请输入是否已婚：");
        String marriage = input.next();
        System.out.println("信息如下：");
        System.out.println("\t姓名：" + name);
        System.out.println("\t年龄：" + age + "岁");
        System.out.println("\t性别：" + sex);
        System.out.println("\t体重：" + weight + "kg");
        System.out.println("\t地址：" + place);
        System.out.println("\t婚否：" + marriage);
        input.close();
    }
    /********* End *********/
}
