package Java高级特性.集合框架1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 第4关：泛型
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/24
 */
public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //程序会输入三次数据
        /********** Begin **********/
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            list.add(sc.next());
        }
        System.out.println("集合的第1个数据为：" + list.get(0));
        System.out.println("集合的第2个数据为：" + list.get(1));
        System.out.println("集合的第3个数据为：" + list.get(2));
        /********** End **********/
    }

}
