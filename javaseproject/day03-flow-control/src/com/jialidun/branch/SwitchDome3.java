package com.jialidun.branch;

import java.util.Scanner;

public class SwitchDome3 {
    //目标：掌握switch语句的switch-case结构
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的性别：");
        String sex = sc.next();
        print(sex);

    }
    //需求：根据男女性别的不同，推荐不同的版本信息给其观看。
    public static void print(String sex){
        switch (sex){
            case "男":
                System.out.println("推荐男版");
                break;
            case "女":
                System.out.println("推荐女版");
                break;
            default:
                System.out.println("推荐通用版");
        }
    }
}
