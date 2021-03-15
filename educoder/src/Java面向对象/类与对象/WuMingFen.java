package Java面向对象.类与对象;
/********** Begin **********/
//在这里添加包名  step4
/**
 * Question5    WuMingFen
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/15
 */

//创建类 添加属性和方法

class WuMingFen{
    String theMa;
    int quantity;
    boolean likeSoup;
    public WuMingFen(String theMa, int quantity)
    {
        this.theMa = theMa;
        this.quantity = quantity;
    }
    public WuMingFen(String theMa, int quantity, boolean likeSoup)
    {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }
    public WuMingFen()
    {
        theMa = "酸辣";
        quantity = 2;
        likeSoup = true;
    }
    public void cheak(){
        System.out.println("面码：" + this.theMa + "，粉的份量：" + this.quantity + "两，是否带汤：" + this.likeSoup);
    }
}

/********** End **********/