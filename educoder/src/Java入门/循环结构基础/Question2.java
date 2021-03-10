package Java入门.循环结构基础;

/**
 * 第2关：Java循环结构之while循环练习
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/10
 */
public class Question2 {
    public static void main(String[] args) {
        /*****start*****/
        int i = 1, sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1到100相加的结果为" + sum);

        /*****end*****/
    }
}
