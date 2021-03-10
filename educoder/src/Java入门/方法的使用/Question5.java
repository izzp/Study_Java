package Java入门.方法的使用;

import java.util.Arrays;

/**
 * 第5关：掌握数组作为参数的使用
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/10
 */
public class Question5 {
    public static void main(String[] args) {

        int[] scores = {79, 52, 98, 81};
        /********** Begin **********/
        //调用方法，传入成绩数组，并获取成绩的个数
        int count = sort(scores);
        /********** End **********/
        System.out.println("共有" + count + "个成绩信息！");
    }

    /*
     * 功能：将考试成绩排序并输出，返回成绩的个数
     *
     */

    /********** Begin **********/
    public static int sort(int[] data) {
        // 数组从小到大排序处理
        Arrays.sort(data);
        // 打印出数组
        int a = 0;
        for (int i : data) {
            a++;
        }
        System.out.println(Arrays.toString(data));
        //返回数组中元素的个数
        return a;
    }
    /********** End **********/
}
