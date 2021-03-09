package Java入门.变量与数据类型;

/**
 * 第2关：变量的使用
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/9
 */
public class Question2 {
    public static void main(String[] args) {
        /********* Begin *********/
        //在这里定义变量 love 并赋初值为 我喜欢在educoder上学习
        String love = "我喜欢在educoder上学习";
        /********* End *********/
        System.out.println("变量love的值为" + love);

        String userName = "张无忌";
        /********* Begin *********/
        //在这一行将userName的值改成李四
        userName = "李四";
        /********* End *********/
        System.out.println("重新赋值后变量userName的值为" + userName);
    }
}
