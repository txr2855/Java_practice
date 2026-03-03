package com.jialidun.variable;

public class VariableDome1 {
    public static void main(String[] args) {
        //认识变量
        show();
    }
    //定义一个方法，来学习变量的定义
    //定义变量：数据类型 变量名 = 值;
    public static void show(){

        int a = 10;
        System.out.println(a);
//        定义一个小数变量，定义一个学生的java成绩
        double score = 90.5;
        System.out.println(score);
//        为啥要用变量记住数据呢？可以提高处理数据的灵活性和维护性
//        研究变量的特点：变量里的数据可以更换的
        int age = 18;
        age = 19;//赋值19
        System.out.println(age);
        age = age + 1;
        System.out.println(age);
        //需求：微信钱包有100元，先消费20元，接着再消费30元，最后再消费1元，请实时输出钱包金额
        double money = 100;
        money = money - 20;
        System.out.println(money);
        money = money - 30;
        System.out.println(money);
        money = money - 1;
        System.out.println(money);


    char ch = 'A';//65的二进制
    System.out.println(ch + 1);
    int ch1 = 0b01100001;  //97的二进制，二进制必须用0b开头
    System.out.println(ch1);
    int ch2 = 0141;  //97的八进制度，八进制必须用0开头
        System.out.println(ch2);
        int ch3 = 0x61;  //97的十六进制，十六进制必须用0x开头
        System.out.println(ch3);


    }
}
