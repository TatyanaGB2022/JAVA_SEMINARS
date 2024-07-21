//1281. Вычесть произведение и сумму цифр целого числа.
//Учитывая целое число n, верните разницу между произведением его цифр и суммой его цифр.
//Пример 1:
//Вход: n = 234
// Выход: 15
// Пояснение:
//Произведение цифр = 2 * 3 * 4 = 24
//Сумма цифр = 2 + 3 + 4 = 9
//Результат = 24 - 9 = 15

//Пример 2:
//Ввод: n = 4421
// Выход: 21
// Пояснение:
// Произведение цифр = 4 * 4 * 2 * 1 = 32.
//Сумма цифр = 4 + 4 + 2 + 1 = 11
//Результат = 32 - 11 = 21
//
//Ограничения:
//1 <= n <= 10^5

package org.geekbrains.seminar_1.task1;

import java.util.Scanner;

public class task1 {
    // Вход: n = 234
    // Выход: 15
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// создание вспомогательного класса для ввода
        //с клавиатуры
        int n = scanner.nextInt();//ввод с клавиатуры
        int result = getGetSumMinusPr(n);
        System.out.println("result= " + result);
    }

    /**
     * @param n начальное значение
     * @return произведение минус сумма
     * @apiNote до описание
     */
    private static int getGetSumMinusPr(int n) {
        int sum = 0;
        int pr = 1; // произведение

        while (n != 0) { //n неравно 0
            sum += n % 10; //sum += или sum ++ или sum +=1
            pr *= n % 10; // pr *= или pr = pr * 1
            n /= 10; //целочисленное деление
        }
        return pr - sum;
    }
}

