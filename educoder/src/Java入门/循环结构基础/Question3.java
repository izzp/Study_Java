package Java入门.循环结构基础;

/**
 * 第3关： Java循环结构之do...while循环
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/10
 */
public class Question3 {
    public static void main(String[] args) {
        int count= 0;	//定义变量存储6的倍数出现的次数
        /*****start*****/
        int i=1;
        do {
            if(i%6==0){
                count++;
                i++;
                continue;
            }
            i++;
        }while (i<=100);

        /*****end*****/
        System.out.println("6的倍数出现的次数为：" + count);
    }
}
