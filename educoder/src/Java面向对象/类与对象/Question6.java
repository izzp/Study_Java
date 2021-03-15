package Java面向对象.类与对象;

/**
 * 第6关：static关键字
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/15
 */
public class Question6 {
    /********** Begin **********/
    static String name = "楚留香";
    static
    {
        System.out.println("hello educoder");
    }
    public static void main(String[] args) {
        System.out.println("我叫" + name);
        study();
    }

    public static void  study(){
        System.out.println("我喜欢在educoder上学习java");
    }
    /********** End **********/
}
