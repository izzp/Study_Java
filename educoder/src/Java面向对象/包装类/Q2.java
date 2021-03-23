package Java面向对象.包装类;

/**
 * 第2关：包装类转换成其他数据类型
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/24
 */
public class Q2 {
    public static void main(String[] args) {

//请在此添加实现代码
/********** Begin **********/
// 定义int类型变量，值为67
        int score = 67;

        // 创建Integer包装类对象，表示变量score的值
        Integer score1 = new Integer(score);

        // 将Integer包装类转换为double类型
        double score2 = score1.doubleValue();

        // 将Integer包装类转换为float类型
        float score3 = score1.floatValue();

        // 将Integer包装类转换为int类型
        int score4 = score1.intValue();

        System.out.println("Integer包装类：" + score1);
        System.out.println("double类型：" + score2);
        System.out.println("float类型：" + score3);
        System.out.println("int类型：" + score4);


/********** End **********/

    }
}

