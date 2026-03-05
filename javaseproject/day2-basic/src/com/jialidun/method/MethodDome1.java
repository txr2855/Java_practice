package com.jialidun.method;

public class MethodDome1 {
    public static void main(String[] args) {
        int sum = getSum(1,2);
        System.out.println(sum);
        System.out.println("----------------------------");
        int sum2 = getSum(2,3);
        System.out.println(sum2);
        System.out.println("----------------------------");
        printHelloWorld();
        System.out.println("----------------------------");
        System.out.println(getVerifyCode(4));


        //掌握方法的定义与调用
    }
    //定义一个方法，求两个数之和并返回
    public static int getSum(int a,int b){
        return a + b;
    }
    //打印3行hello world
    public static void printHelloWorld(){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        //不需要返回值也不需要参数
        //如果没有返回结果，方法定义的时候，返回值类型必须声明成void
    }
    //我现在要一个指定位数的验证码返回
    public static String getVerifyCode(int n){
        String code = "";
        for (int i = 0; i < n; i++) {
            int number = (int)(Math.random()*10);
            code += number;
        }
        return code;
    }
}
