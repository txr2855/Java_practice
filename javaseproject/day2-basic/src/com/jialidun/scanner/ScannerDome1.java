package com.jialidun.scanner;
import java.util.Scanner;

public class ScannerDome1 {

    public static void main(String[] args) {
        print1();
    }

    //我是一个零基础的小白，请问你如何使用Scanner类进行输入？
    public static void print1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();
        System.out.println("你输入的数字是：" + number);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        System.out.println("你输入的字符串是：" + str);
        System.out.println("请输入一个布尔值：");
        boolean bool = sc.nextBoolean();
        System.out.println("你输入的布尔值是：" + bool);
    }


        }

