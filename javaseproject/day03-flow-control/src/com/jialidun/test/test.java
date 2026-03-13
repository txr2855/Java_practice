package com.jialidun.test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字1：");
        int n = sc.nextInt();
        System.out.println("请输入加减乘除号：");
        char c = sc.next().charAt(0);
        System.out.println("请输入数字2：");
        int m = sc.nextInt();
        System.out.println(print(n,c,m));


    }
    public static int print(int n,char c,int m){
        int a = 0;
        switch (c){
            case '+':
                a = n+m;
                break;
            case '-':
                a = n-m;
                break;
            case '*':
                a = n*m;
                break;
            case '/':
                a = n/m;
                break;
            default:
                System.out.println("输入错误");
        }
        return a;
    }
}
