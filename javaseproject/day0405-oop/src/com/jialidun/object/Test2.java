package com.jialidun.object;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "小明";
        s1.chinese = 80;
        s1.math = 90;
        s1.printAllScore();
        s1.printAverageScore();
        //再写一个
        Student s2 = new Student();
        s2.name = "小王";
        s2.chinese = 0;
        s2.math = 90;
        s2.printAllScore();
        s2.printAverageScore();
    }
}
