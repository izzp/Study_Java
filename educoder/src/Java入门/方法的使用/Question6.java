package Java入门.方法的使用;

/**
 * 第6关：方法的重载
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/10
 */
public class Question6 {
    public static void main(String[] args) {

        /********** Begin **********/
        // 调用无参的方法
        print();
        // 调用带有一个字符串参数的方法
        print("educoder");
        // 调用带有一个整型参数的方法
        print(666);
        /********** End **********/
    }

    /********** Begin **********/
    // 无参print方法的定义
    public static void print() {
        System.out.println("无参的print方法");
    }

    // 字符串print方法的定义
    public static void print(String a) {
        System.out.println("带有一个字符串参数的print方法，参数值为：" + a);
    }

    // 整型print方法的定义
    public static void print(int a) {
        System.out.println("带有一个整型参数的print方法，参数值为：" + a);
    }

    /********** End **********/
}
