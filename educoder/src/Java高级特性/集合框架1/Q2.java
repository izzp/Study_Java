package Java高级特性.集合框架1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 第2关：ArrayList集合的增删改查
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/24
 */
public class Q2 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //获取输入的数据并添加至集合
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        int length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            list.add(sc.next());
        }
        /********** Begin *********/
        list.remove(length - 1);
        list.remove(0);
        list.add("hello");
        list.add("educoder");
        list.set(2, "list");
        for (int i = 0; i < length; i++) {
            System.out.println(list.get(i));
        }
        /********** End **********/
    }
}

