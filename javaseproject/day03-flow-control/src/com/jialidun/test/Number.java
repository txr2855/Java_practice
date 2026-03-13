package com.jialidun.test;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        print();
    }
    public static void print(){
        int num = ( int)(Math.random()*100)+1;
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do{
            System.out.println("请输入一个1到100直接的数");
            a = sc.nextInt();
            if(a > num){
                System.out.println("太大了");
            }else if(a < num){
                System.out.println("太小了");
            }else if(a == num){
                System.out.println("恭喜你猜对了");
            }else{
                System.out.println("输入错误");
            }
        } while (a != num);




    }


}
