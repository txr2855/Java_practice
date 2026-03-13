package com.jialidun;

public class ArrayTest {
    public static void main(String[] args) {
        printArray(5);



        //目标：完成数字华容道的初始化和随机乱序


    }

    public static void printArray(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i * n + j + 1;
            }
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                int m = ( int)(Math.random() *arr.length);
                int p = ( int)(Math.random() *arr.length);
                int temp = arr[i][j];
                arr[i][j] = arr[m][p];
                arr[m][p] = temp;

            }
        }
        printArray(arr);


    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
