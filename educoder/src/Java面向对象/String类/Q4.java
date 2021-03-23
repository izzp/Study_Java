package Java面向对象.String类;

import java.util.Scanner;

/**
 * 第4关：StringBuffer类的定义和使用 - 字母反转
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/23
 */
public class Q4 {

    //main测试不通过，故未添加

    public static StringBuffer start(String data) {
        StringBuffer ans = new StringBuffer();
        /********** Begin *********/
        String[] a = data.split(" ");
        for (int i = 0; i < a.length; i++) {
            StringBuffer word = new StringBuffer(a[i]);
            ans.append(word.reverse());
            ans.append(" ");
        }
        /********** End *********/
        return ans;
    }
}
