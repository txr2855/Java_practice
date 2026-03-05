package com.jialidun.operator;

public class OperatorDome3 {
    public static void main(String[] args) {
        getRedPacket(100);
        print(10,20);
        //掌握扩展的赋值运算符


    }
    //需求：收红包
    public static void getRedPacket(int money){
        money += 10;
        System.out.println("收红包成功，余额为：" + money);

    }
    //三元运算符
    public static void print(int a,int b){
        int c = a > b ? a : b;
        System.out.println(c);
    }
}
