package com.jialidun.variable;

public class VariableDome2 {
    public static void main(String[] args) {
        printVariable();
        //目标：掌握8种基本类型的定义




    }
    //帮我定义一个类，把8种基本类型按顺序都給我写出来
    public static void printVariable(){
        //整数型
        byte a = 10;
        System.out.println(a);
        short b = 20;
        System.out.println(b);
        int c = 30;
        System.out.println(c);
        //注意：因为默认写的都是int，所以记录long类型必须加L，否则会报错
        long d = 11111111111999199l;
        //浮点型
        System.out.println(d);
        float e = 50.5f;
        //注意：因为默认写的都是double，如果希望是float类型的，那么必须加f
//        float e2 = 50.5;
        System.out.println(e);
        double f = 60.5;
        System.out.println(f);
        //字符型
        char g = 'a';
        System.out.println(g);
        //布尔型
        boolean h = true;
        boolean i = false;
        System.out.println(h);
        System.out.println("===================");
        //扩展字符串型
        String j = "hello world";
        System.out.println(j);

    }


}
