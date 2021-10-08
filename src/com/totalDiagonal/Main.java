package com.totalDiagonal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " rows and " +
                arr[0].length + " columns: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int m = 0; m < arr.length; m++) {
            System.out.println("");
            for (int n = 0; n < arr[m].length; n++) {
                System.out.print(arr[m][n] + "\t");
            }
        }
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                if(i == j){
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.print("tổng đường chéo là: " + sum);
    }
}
