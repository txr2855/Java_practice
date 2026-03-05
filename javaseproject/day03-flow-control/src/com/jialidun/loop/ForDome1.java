package com.jialidun.loop;

public class ForDome1 {
    public static void main(String[] args) {
        System.out.println(print2(100));
        System.out.println(print3(100));
        print4(1000);
        //需求：使用for循环，掌握for循环的书写，搞清楚其执行流程

    }

    public static void print() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }
    }

    public static int print2(int n) {
        int a = 0;
        for (int i = 0; i <= n; i++) {
            a += i;
        }
        return a;
    }

    public static int print3(int n) {
        int b = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                b += i;
            }
        }
        return b;
    }
    public static void print4(int n){
        for (int i = 100; i < n; i++) {
int num1 = i / 100;
int num2 = i / 10 % 10;
int num3 = i % 10;
if (num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3 == i) {
    System.out.println(i);

}
        }

    }
}