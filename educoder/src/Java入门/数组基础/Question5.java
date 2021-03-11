package Java入门.数组基础;

/**
 * nav 第5关：二维数组
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/11
 */
public class Question5 {
    public static void main(String[] args) {
        /********** Begin **********/
        int[][] scores = {
                {92, 85},
                {91, 65},
                {90, 33}
        };
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println(scores[i][j]);
                scores[i][j] = j + 1;
            }
        }
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println(scores[i][j]);
            }
        }
        /********** End **********/
    }
}
