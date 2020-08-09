package cn.demo.day04.demo02;

/**
 * @author zzp
 * @date 2020/8/9 20:23
 */

/*public static void 方法名称（）{
    方法体
}*/

public class Demo01Method {
    public static void main(String[] args) {
        printfMethod();
    }
    public static void printfMethod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
