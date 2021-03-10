package Java入门.循环结构基础;

/**
 * 第5关：break和continue关键字
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/10
 */
public class Question5 {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 20) {
            i++;
            /*****start*****/
            if (i % 2 == 0) {
                System.out.println(i + "是偶数");
                continue;

            }
            System.out.println(i + "是奇数");

            if (i == 13) {
                break;
            }

            /*****end*****/
        }
    }
}
