package com.jialidun.test;


import java.util.Random;

public class Code {
    public static void main(String[] args) {
        System.out.println(cod(4));
        System.out.println(cod(5));



    }

    public static String cod(int n) {
        Random random = new Random();
        String code = "";
        for(int i = 0; i < n; i++){
            int a = random.nextInt(3);
            switch (a){
                case 0:
                    int b = random.nextInt(10);
                    char e = (char)(b + '0');
                    code += e;
                    break;
                case 1:
                    int c = random.nextInt(26);
                    code += (char)(c + 'a');
                    break;
                case 2:
                    int d = random.nextInt(26);
                    code += (char)(d + 'A');
                    break;
            }



        }
        return (code);
    }




}
