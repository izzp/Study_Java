package Java面向对象.类与对象;

import java.util.Scanner;

/**
 * 第2关：构造方法
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/15
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String sex = sc.next();
        /********** Begin **********/
        //分别使用两种构造器来创建Person对象
        Person a = new Person();
        a.Person();
        a.Person(name,sex);
        /********** End **********/

    }

//创建Person对象，并创建两种构造方法
/********** Begin **********/
static class Person{
    String name;
    String sex;
    public void  Person(){
        System.out.println("一个人被创建了");
    }
    public void  Person(String Name, String Sex){
        System.out.println("姓名：" + Name + "，性别：" + Sex + "，被创建了");
    }
}
/********** End **********/
}
