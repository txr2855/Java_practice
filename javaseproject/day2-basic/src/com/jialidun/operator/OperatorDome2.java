package com.jialidun.operator;

public class OperatorDome2 {

    public static void main(String[] args) {
        print(10);
        //目标：掌握自增自减运算符
    }
    //设计一个方法接收一个整数
    public static void print(int a){
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(a);
    }
}

