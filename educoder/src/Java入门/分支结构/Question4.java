package Java入门.分支结构;

import java.util.Scanner;

/**
 * 第4关：Java分支结构之Switch
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/9
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入月份：");

        int input = sc.nextInt();    //获取输入的月份

        //通过输入的月份来判断当前季节并输出
        /*****start*****/
        switch (input) {
            case 3:
            case 4:
            case 5:
                System.out.println(input + "月是春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(input + "月是夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(input + "月是秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(input + "月是冬天");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
        /*****end*****/

    }
}
