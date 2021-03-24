package Java高级特性.集合框架1;

import java.util.ArrayList;

/**
 * 第1关：集合的基本使用
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/24
 */
public class Q1 {

    @SuppressWarnings("unchecked")
    public ArrayList getList() {
        /********** Begin **********/
        ArrayList list = new ArrayList();
        list.add("https:www.educoder.net");
        list.add(2018.423);
        return list;
        /********** End **********/
    }
    public static void main(String[] args) {
        Q1 hello = new Q1();
        ArrayList arr = hello.getList();
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
    }
}

