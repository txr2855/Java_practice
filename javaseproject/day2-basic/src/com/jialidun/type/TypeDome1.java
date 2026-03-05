package com.jialidun.type;

public class TypeDome1 {
    public static void main(String[] args) {
        //目标：认识自动类型转换，强制类型转换
        int a = 10;
        byte b =( byte)a;
        print2(b);

    }
    public static void print3(int b){
        System.out.println(b);
        //是不是很奇怪，参数b的类型是int，但是方法内部使用的是byte，但是编译没有问题
        //这是因为JVM会自动将byte转换成int
        //强制类型转换：类型 变量2 = (类型)变量1;
        //
    }
    public static void print2(byte b){
        System.out.println(b);
    }
}
