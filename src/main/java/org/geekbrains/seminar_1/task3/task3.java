package org.geekbrains.seminar_1.task3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        //Дана строка. Поменять местами ее половины.
        String str = "qweasd";
        String result = str.substring(str.length() / 2) +
                str.substring(0, str.length() / 2);
        System.out.println("result = " + result);
    }
}
