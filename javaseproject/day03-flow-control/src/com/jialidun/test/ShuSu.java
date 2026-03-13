package com.jialidun.test;

public interface ShuSu {
    public static void main(String[] args) {
        isShuSu();
        System.out.println(isShuSu());


    }
    public static String isShuSu(){
        String shushu = "";
        int i = 0;
        int nengshu = 0;
        for (i = 101; i <= 200; i++){
            nengshu = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                nengshu +=1;

            }

        }
        if (nengshu == 2) {
            shushu += i + " ";
        }








        }
        return shushu;
    }

    }

