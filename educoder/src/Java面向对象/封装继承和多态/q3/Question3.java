package Java面向对象.封装继承和多态.q3;


/**
 * 第三关 super关键字的使用
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/16
 */
public class Question3 {
    public static void main(String[] args) {
        // 实例化一个Student类的对象s，为Student对象s中的school赋值，打印输出信息
        /********* begin *********/
        Student s1 = new Student("张三",18,"哈佛大学");
        System.out.println("姓名：" + s1.name + "，年龄：" + s1.age + "，学校：" + s1.school);
        /********* end *********/
    }
}

class Person {
    /********* begin *********/
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /********* end *********/
}

class Student extends Person {
    /********* begin *********/
    String school;

    Student(String name,int age,String school) {
        super(name, age);
        this.school=school;
    }
    /********* end *********/
}
