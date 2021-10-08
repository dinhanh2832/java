package com.sumColumn;

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
        System.out.println("cột muốn tính tổng: ");
        int x = sc.nextInt();
        int y = x - 1;
        int total = 0;
        for (int row = 0; row < arr.length; row++) {
            total += arr[row][x];
        }
        System.out.println("Sum for column " + y + " is "
                + total);
    }
}
