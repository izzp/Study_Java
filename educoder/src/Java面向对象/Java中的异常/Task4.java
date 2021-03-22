package Java面向对象.Java中的异常;

import java.util.Scanner;

/**
 * 第4关：自定义异常
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/22
 */
public class Task4 {
    /********* Begin *********/
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        //判断用户名
        if (username.length() < 3) {
            throw new MyException("用户名小于三位Exception");
        } else {
            System.out.print("用户名格式正确");
        }

    }
}

class MyException extends Exception {
    MyException() {
    }

    MyException(String message) {
        super(message);
    }
}

