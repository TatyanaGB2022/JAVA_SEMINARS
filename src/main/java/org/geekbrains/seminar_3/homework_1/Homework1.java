package org.geekbrains.seminar_3.homework_1;

import java.util.Arrays;

/**
 * Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел,
 * реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
 * <p>
 * Пример
 * <p>
 * a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
 */
class MergeSort {
    public static int[] mergeSort(int[] a) {
        if (a.length <= 1) {
            return a;
        }

        int mid = a.length / 2;
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Homework1 {
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}
/**Идеальное решение
 *

 import java.util.Arrays;

 class MergeSort {
 public static int[] mergeSort(int[] a) {
 int n = a.length;
 if (n < 2) {
 return a;
 }
 int mid = n / 2;
 int[] l = new int[mid];
 int[] r = new int[n - mid];

 for (int i = 0; i < mid; i++) {
 l[i] = a[i];
 }
 for (int i = mid; i < n; i++) {
 r[i - mid] = a[i];
 }
 l = mergeSort(l);
 r = mergeSort(r);

 return merge(l, r);
 }

 public static int[] merge(int[] l, int[] r) {

 int left = l.length;
 int right = r.length;
 int[] a = new int[left + right];
 int i = 0, j = 0, k = 0;

 while (i < left && j < right) {
 if (l[i] <= r[j]) {
 a[k++] = l[i++];
 }
 else {
 a[k++] = r[j++];
 }
 }
 while (i < left) {
 a[k++] = l[i++];
 }
 while (j < right) {
 a[k++] = r[j++];
 }

 return a;
 }
 }

 public class Printer{
 public static void main(String[] args) {
 int[] a;

 if (args.length == 0) {
 a = new int[]{5, 1, 6, 2, 3, 4};
 } else {
 a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
 }

 MergeSort answer = new MergeSort();
 String itresume_res = Arrays.toString(answer.mergeSort(a));
 System.out.println(itresume_res);
 }
 }
 */
