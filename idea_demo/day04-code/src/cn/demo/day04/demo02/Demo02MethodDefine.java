package cn.demo.day04.demo02;

/**
 * @author zzp
 * @date 2020/8/9 20:33
 */
public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10,20);
        System.out.println("=========");

        //打印调用
        System.out.println(sum(2,4));
        System.out.println("=========");

        //赋值调用
        int number =sum(15,25);
        System.out.println("变量的值："+number);
    }

    public static int sum(int a, int b) {
        System.out.println("方法执行了！");
        int result = a + b;
        return result;
    }
}
