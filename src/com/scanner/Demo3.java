package com.scanner;

import java.util.Scanner;

/**
 * @author Misluo
 * @create 2021/6/6 16:13
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //从键盘接受数据
        int i=0;
        float f=0.0f;
        System.out.println("请输入整数：");
        //如果。。。。。那么
        if (scanner.hasNextInt()){
            i=scanner.nextInt();
            System.out.println("整数数据："+i);
        }else{
            System.out.println("输入的不是整数数据");
        }
        System.out.println("请输入小数：");
        //如果。。。。。那么
        if (scanner.hasNextFloat()) {
            f = scanner.nextFloat();
            System.out.println("小数数据：" + f);
        }else{
            System.out.println("输入的不是小数数据");
        }
        scanner.close();
    }
}