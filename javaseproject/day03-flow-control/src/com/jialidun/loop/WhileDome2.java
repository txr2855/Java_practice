package com.jialidun.loop;

public class WhileDome2 {
    public static void main(String[] args) {
        test1();
        test2();
        System.out.println(test3());
//目标：认识while循环的写法，搞清楚其执行流程
    }
    public static void test1() {
        int i = 1;
        while (i <= 5) {
            System.out.println("hello world");
            i++;
        }
    }
    public static void test2() {
        double i = 100000;
        int year= 0;
        while (i < 200000) {
            i += i * 0.017;
            year++;
        }
        System.out.println("第"+year+"年后");
    }
    public static int test3() {
        double height = 8848860;
        double papper = 0.1;
        int i = 0;
        while (papper<8848860){
            papper = papper*2;
            i++;


        }return i ;

    }
}
