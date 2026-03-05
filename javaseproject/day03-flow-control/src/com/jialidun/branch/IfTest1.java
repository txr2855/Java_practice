package com.jialidun.branch;

import java.util.Scanner;

public class IfTest1 {
    public static void main(String[] args) {
        System.out.println("现在是什么灯亮");
        Scanner sc = new Scanner(System.in);
        String light = sc.next();
        if (light.equals("红灯")){
            System.out.println("请立即停止");
        }else if (light.equals("黄灯")){
            System.out.println("请稍等");
        }else if (light.equals("绿灯")){
            System.out.println("请继续");
        }else{
            System.out.println("请重新输入");
        }


    }
    public static void main1(String[] args) {

        }
    }


