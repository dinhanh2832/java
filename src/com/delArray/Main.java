package com.delArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số cần xóa: ");
        int indexDel = 0;
        int x = sc.nextInt();
        for (int i = 0; i < arr.length;i++){
            if(arr[i] == x){
                indexDel = i;
            }
        }
        for(int i = indexDel; i < arr.length;i++){
            arr[i - 1] = arr[i];
            //arr[arr.length - 1] = 0;
        }
        for (int i = 0; i < arr.length - 1;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
