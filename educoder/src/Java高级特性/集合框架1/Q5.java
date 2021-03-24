package Java高级特性.集合框架1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 第5关：Map集合的增删改查
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/24
 */
public class Q5 {
    public static void main(String[] args) {
        Map<String, Integer> menuDict = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            menuDict.put(sc.next(), sc.nextInt());
        }
        /********** Begin **********/
        menuDict.put("lamb", 50);
        System.out.println(menuDict.get("fish"));
        menuDict.put("fish", 100);
        menuDict.remove("noodles");
        System.out.println(menuDict.toString());
        /********** End **********/
    }

}
