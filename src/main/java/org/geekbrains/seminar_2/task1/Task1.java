package org.geekbrains.seminar_2.task1;

import java.util.Scanner;

//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая
//состоит из чередующихся символов c1 и c2, начиная с c1.
//public class Task1 {
// public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        shuffleLine(n);
//    }

//    private static void shuffleLine(int n) {
//        String line1 = "c1";
//        String line2 = "c2";
//        String resalt = "";
//
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0) {
//                resalt += line1;
//            } else {
//                resalt += line2;
//            }
//        }
//        System.out.println(resalt);
//    }
//}

/**
 * или такое решение
 * private static String getStrOfChars(int n, String c1, String c2) throws Exception {
 * if (n <= 0 || n % 2 == 1) {
 * throw new Exception("Не валидное значение N");
 * }
 * StringBuilder sb = new StringBuilder();
 * for (int i = 0; i < n / 2; i++) {
 * sb.append(c1).append(c2);
 * }
 * return sb.toString();
 * }
 * }
 */
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String c1= "c1";
        String c2 = "c2";

        String result = (c1 + c2).repeat(n / 2);
        System.out.println(result);
    }
}