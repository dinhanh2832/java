package com.mergeArray;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};
        int[] arr3;
        arr3 = new int[arr1.length + arr2.length];
        for(int i = 0;i < arr1.length;i++){
            arr3[i] = arr1[i];
        }
        for (int i = 0;i < arr2.length;i++){
            arr3[arr1.length + i] = arr2[i];
        }
        for (int i = 0; i < arr3.length;i++){
            System.out.print(arr3[i] + "\t");
        }
    }
}
