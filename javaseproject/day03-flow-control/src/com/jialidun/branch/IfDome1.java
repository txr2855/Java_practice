package com.jialidun.branch;

import java.util.Scanner;

public class IfDome1 {
    //认识if语句，搞清楚写法与应用场景（独立功能独立方法
    public static void main(String[] args) {
        print1();
        print2( 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额：");
        int money = sc.nextInt();
        print3(money);

    }
    public static void print1(){
        int a = 10;
        if (a > 5){
            System.out.println("a大于5");

        }
        System.out.println("对对对");
    }
    public static void print2(int money){
    if(money >= 100){
        System.out.println("可以买iphone");
    }else{
        System.out.println("不可以买iphone");
    }
    }
    public static void print3(int money){
        if(money >= 10000){
            System.out.println("可以买iphone");
        }else if(money<10000&&money >= 5000){
            System.out.println("可以买ipad");
        }
        else if(money >= 20){
            System.out.println("可以买书");
        }
        else{
            System.out.println("不可以买");
        }
    }
}
