package com.jialidun.method;

public class MethodDome3 {
    public static void main(String[] args) {
        getDiv(10,2);
        //掌握在无返回值的方法中单独使用return结束方法

    }
//设计一个除法的功能,并且可以不写return，直接用return打破
    public static void getDiv(int a,int b){
        if (b == 0){
            System.out.println("除数不能为0");
            return ;//提前退出方法,卫语言风格
        }
   System.out.println(a/b);
    }


}
