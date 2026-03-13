package com.jialidun.thisdome;

public class Student {
    public void print(){
        //this：是一个变量，用在方法中，用于拿到当前对象
        //哪个对象拿到this，this就代表哪个对象
        System.out.println(this);
    }
}
