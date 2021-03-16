package Java面向对象.封装继承和多态.q8;

/**
 * 第8关：什么是多态，怎么使用多态
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/16
 */
public class TestPolymorphism {
    public static void main(String[] args) {
        // 以多态方式分别实例化子类对象并调用eat()方法
        /********* begin *********/
        Dog dog =new Dog();
        Cat cat = new Cat();
        Lion lion=new Lion();
        dog.eat();
        cat.eat();
        lion.eat();
        /********* end *********/
    }
}

// Animal类中定义eat()方法
class Animal {
    /********* begin *********/
    public void eat() {

    }
    /********* end *********/
}

// Dog类继承Animal类 复写eat()方法
class Dog extends Animal {
    /********* begin *********/
    public void eat() {
        System.out.println("eating bread...");
    }
    /********* end *********/
}

// Cat类继承Animal类 复写eat()方法
class Cat extends Animal {
    /********* begin *********/
    public void eat() {
        System.out.println("eating rat...");
    }
    /********* end *********/
}

// Lion类继承Animal类 复写eat()方法
class Lion extends Animal {
    /********* begin *********/
    public void eat() {
        System.out.println("eating meat...");
    }
    /********* end *********/
}

