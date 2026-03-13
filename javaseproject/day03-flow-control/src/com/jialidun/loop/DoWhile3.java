package com.jialidun.loop;

public class DoWhile3 {
    public static void main(String[] args) {
        print();
        //搞清楚do...while循环的写法，并理解其特点
    }
    //使用do...while循环，打印3次helloworld
    //特点：do...while循环至少会执行一次，先执行，后判断
    public static void print(){
        int i = 0;
        do {
            System.out.println("helloworld");
            i++;
        }while (i < 3);
        }
    }


