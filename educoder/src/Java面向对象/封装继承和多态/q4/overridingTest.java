package Java面向对象.封装继承和多态.q4;

/**
 * 第4关：方法的重写与重载
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/16
 */
public class overridingTest {
    public static void main(String[] args) {
        // 实例化子类对象s，调用talk()方法打印信息
        /********* begin *********/
        String name = "张三";
        int age = 18;
        String school = "哈佛大学";
        Student s = new Student(name, age, school);
        System.out.println(s.talk());
        /********* end *********/

    }
}

class Person {
    /********* begin *********/
    String name;
    int age;
    String talk() {

        return "我是：" + name + "，今年：" + age + "岁";
    }
    /********* end *********/
}

class Student extends Person {
    /********* begin *********/
    String school;

    Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    String talk() {
        String str =super.talk();
        return str+"，我在" + school + "上学";
    }
}