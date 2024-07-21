package org.geekbrains.seminar_1.homework_2;
//Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000,
// каждое на новой строке.
//Напишите свой код в методе printPrimeNums класса Answer.
class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        for (int num = 2; num <= 1000; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Homework2{
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}
/**
 * Идеальное решение
 * class Answer {
 *        public static void printPrimeNums() {
 *         // Напишите свое решение ниже
 *
 *         // Проход начинается с 2, т.к. это число является наименьшим простым
 *         for (int i = 2; i <= 1000; i++) {
 *
 *             boolean isPrime = true;
 *
 *             // Проверка, является ли число i простым
 *             // Проход по циклу до корня числа,
 *             // т.к. дальше нет смысла искать, делителей нет.
 *             for (int j = 2; j <= Math.sqrt(i); j++) {
 *                 if (i % j == 0) {
 *                     isPrime = false;
 *                     break;
 *                 }
 *             }
 *             // Если число i простое, вывод его на экран
 *             if (isPrime)
 *                 System.out.println(i);
 *                     }
 *     }
 * }
 *
 * public class Printer{
 *     public static void main(String[] args) {
 *
 *       Answer ans = new Answer();
 *       ans.printPrimeNums();
 *     }
 * }
 */