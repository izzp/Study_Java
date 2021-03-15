package Java面向对象.类与对象;

/**
 * 第1关：什么是类，如何创建类
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/15
 */
public class Question1 {
    public static void main(String[] args) {
        /********** Begin **********/
        //创建Dog对象
        //设置Dog对象的属性
        Dog wuhuarou = new Dog();
        wuhuarou.name = "五花肉";
        wuhuarou.color = "棕色";
        wuhuarou.variety = "阿拉斯加";
        //输出小狗的属性
        System.out.println("名字：" +wuhuarou.name +"，毛色：" +wuhuarou.color +"，品种：" +wuhuarou.variety);

        //调用方法
        wuhuarou.eat();
        wuhuarou.run();
        /********** End **********/

    }


//在这里定义Dog类
/********** Begin **********/
public static class Dog{
    String name;
    String color;
    String variety;
    void eat(){System.out.println("啃骨头");}
    void run(){System.out.println("叼着骨头跑");}
}
/********** End **********/
}
