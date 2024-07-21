package org.geekbrains.seminar_2.task3;

import java.util.Scanner;

/**
 * * Напишите метод, который принимает на вход строку (String) и
 * определяет является ли строка палиндромом (возвращает
 * boolean значение).
 */
//public class Task3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        boolean flag = true;
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i)!= str.charAt(str.length() - i -1)){
//                flag = false;
//                break;
//            }
//
//        }
//        if(flag){
//            System.out.println("palindrom");
//        }
//        else {
//            System.out.println("no palindrom");
//        }
//    }
//}
public class Task3 {
    public static void main(String[] args) {
        String stroka = "qwe eWQ".replaceAll("\\s", "").toLowerCase();
        if (stroka.equals(new StringBuilder(stroka).reverse().toString())) {
            System.out.println("palindrom");
        } else {
            System.out.println("no palindrom");
        }
    }
}