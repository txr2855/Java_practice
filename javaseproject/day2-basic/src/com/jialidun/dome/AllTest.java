package com.jialidun.dome;

import java.util.Scanner;

public class AllTest {
    public static void main(String[] args) {
        // 核心优化1：只创建1个Scanner对象，避免资源浪费和输入异常
        Scanner sc = new Scanner(System.in);

        System.out.println("欢迎来到健康计算器");

        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        // 关键：清空nextInt留下的回车符，避免后续输入性别时直接跳过
        sc.nextLine();

        System.out.println("请输入你的性别（男/女）：");
        String sex = sc.nextLine();

        System.out.println("请输入你的体重（单位：kg）：");
        double weight = sc.nextDouble();

        System.out.println("请输入你的身高（单位：cm）：");
        double height = sc.nextDouble();

        // 优化：先接收返回值再输出，避免重复调用方法
        double bmi = getBMI(weight, height);
        // 格式化输出，保留2位小数，更符合实际使用习惯
        System.out.printf("你的BMI值为：%.2f\n", bmi);

        double bmr = getBMR(age, sex, height, weight);
        System.out.printf("你的BMR值为：%.1f 千卡/天\n", bmr);

        System.out.println("----------------");

        // 关闭Scanner，释放系统资源
        sc.close();
    }

    // 核心修复：BMI计算时身高单位转换（cm转m），否则结果完全错误
    public static double getBMI(double weight, double height) {
        // 身高输入是cm，需转为m（除以100），这是BMI公式的核心要求
        double heightInMeter = height / 100;
        double bmi = weight / (heightInMeter * heightInMeter);
        return bmi;
    }

    // 优化：兼容大小写输入（比如输入“男”/“MAN”都能识别），更友好
    public static double getBMR(int age, String sex, double height, double weight) {
        double bmr = 0;
        // 用equals比较字符串，逻辑正确；增加toUpperCase兼容大小写
        if ("男".equals(sex) || "MAN".equals(sex.toUpperCase())) {
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        } else {
            bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        }
        return bmr;
    }
}
