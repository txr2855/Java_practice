package com.jialidun.method;

public class MethodDome2 {
     public static void main(String[] args) {
         //掌握方法重载
     }
     //定义一个方法，打印一个整数
     public static void print(int a){
         System.out.println(a);

     }
     //定义一个重载的方法
     public static void print(String a){
         System.out.println(a);
     }
     //定义一个重载的方法
      public static void print(double a){
          System.out.println(a);
      }
      //方法重载只关心名称相同，形参列表不同（类型不同，个数不同，顺序不同），其他的都无所谓
    //
}
