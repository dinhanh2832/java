package com.pushArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Size should not exceed 20");
        } while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length/2) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("nhập vào vị trí muốn thêm: ");
        int index = scanner.nextInt();
        if(index < -1 || index > size){
            System.out.print("không chèn đc bạn ạ!");
        }
        System.out.println("nhập vào số muốn thêm");
        int x = scanner.nextInt();

        for (int j = index;j < array.length;j++){
            array[j - 1] = array[j];
            array[index - 1] = x;
        }
        for(int j = 0; j < size;j++){
            System.out.print(array[j] + "\t");
        }
    }
}
