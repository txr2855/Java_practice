package com.jialidun.object;

public class Test {
    public static void main(String[] args) {
        //目标：学会创建对象
        //格式：类名 对象名 = new 类名();
        Star s1 = new Star();
        s1.name =  "王伟伟";
        s1.age = 18;
        s1.sex = "男";
        s1.height = 1.7;
        s1.weight = 80.5;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.sex);
        System.out.println(s1.height);
        System.out.println(s1.weight);

        //创建新的
        Star s2 = new Star();
        s2.name = "大卫";
        s2.age = 90;
        s2.sex = "男";
        s2.height = 1.72;
        s2.weight = 60.5;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.sex);
        System.out.println(s2.height);
        System.out.println(s2.weight);



    }
}
