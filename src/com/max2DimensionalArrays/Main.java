package com.max2DimensionalArrays;

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
        int maxArray = arr[0][0];
        String index = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxArray) {
                    maxArray = arr[i][j];
                    index = i + ", " + j;
                }
            }
        }
        System.out.print("giá trị max trong mảng là: " + maxArray);
        int minArray = arr[1][0];
        String index2 = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < minArray) {
                    minArray = arr[i][j];
                    index2 = i + ", " + j;
                }
            }
        }
        System.out.print("giá trị max trong mảng là: " + minArray);
    }
}
