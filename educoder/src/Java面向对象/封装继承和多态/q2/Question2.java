package Java面向对象.封装继承和多态.q2;

/**
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/16
 */
public class Question2 {
    public static void main(String args[]) {
        // 实例化一个Cat对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
        /********* begin *********/
        Cat cat = new Cat();
        cat.name = "大花猫";
        cat.age = 6;
        cat.voice();
        cat.eat();
        System.out.println(cat.name + cat.age + "岁");
        /********* end *********/

        // 实例化一个Dog对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
        /********* begin *********/
        Dog dog = new Dog();
        dog.name = "大黑狗";
        dog.age = 8;
        dog.voice();
        dog.eat();
        System.out.println(dog.name + dog.age + "岁");
        /********* end *********/

    }
}

class Animal {
    /********* begin *********/
    String name;
    int age;
/********* end *********/

}

class Cat extends Animal {
    // 定义Cat类的voice()和eat()方法
    public void voice() {
        System.out.println(name + "喵喵叫");
    }

    public void eat() {
        System.out.println(name + "吃鱼");
    }
    /********* end *********/
}

class Dog extends Animal {
    // 定义Dog类的voice()和eat()方法

    /********* begin *********/
    public void voice() {
        System.out.println(name + "汪汪叫");
    }

    public void eat() {
        System.out.println(name + "吃骨头");
    }
    /********* end *********/
}
