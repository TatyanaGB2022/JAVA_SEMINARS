package org.geekbrains.seminar_1.task4;

import java.util.Scanner;

public class task4 {
    //Дан массив целых чисел. Верно ли, что массив является симметричным.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введи значение массива: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Cимметричный");
        } else {
            System.out.println("Не симметричный");
        }

        System.out.println("Массив выглядит так:  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" %d , ", arr[i]);

        }
    }
}
