package org.geekbrains.seminar_3.task2;

import java.util.*;

/**
 * Заполнить список десятью случайными числами.
 * Отсортировать список методом sort() и вывести его на
 * экран.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.printf("%d ", list[i]);
        }

        Random rnd = new Random();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list2.add(rnd.nextInt(100, 500));
        }
        Collections.sort(list2);
        System.out.println(list2);
    }
}

