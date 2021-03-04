package com.mezzp.method;

/**
 * 命令行传递参数
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/4
 */
public class Demo03 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]:" + args[i]);
        }
    }
}
//D:\02_Git\Study_Java\JavaSE\基础语法\src>java com.mezzp.method.Demo03 this is java
