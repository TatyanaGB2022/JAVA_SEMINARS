package org.geekbrains.seminar_2.homework_2;

/**
 * Сортировка пузырьком с логированием
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите
 * в лог-файл.
 * <p>
 * Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
 * <p>
 * int[] arr - числовой массив
 * <p>
 * После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' в
 * формате год-месяц-день час:минуты {массив на данной итерации}. Для логирования использовать
 * логгер logger класса BubbleSort.
 * <p>
 * Пример
 * <p>
 * arr = new int[]{9, 4, 8, 3, 1};
 * sort(arr)
 * <p>
 * // При чтении лог-файла получим:
 * 2023-05-19 07:53 [4, 8, 3, 1, 9]
 * 2023-05-19 07:53 [4, 3, 1, 8, 9]
 * 2023-05-19 07:53 [3, 1, 4, 8, 9]
 * 2023-05-19 07:53 [1, 3, 4, 8, 9]
 * 2023-05-19 07:53 [1, 3, 4, 8, 9]
 */
//public class Homework2 {

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        try {
            log = new File("log.txt");
            fileWriter = new FileWriter(log);

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

            for (int i = 0; i < mas.length; i++) {
                boolean swapped = false;
                for (int j = 0; j < mas.length - i - 1; j++) {
                    if (mas[j] > mas[j + 1]) {
                        int temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = temp;
                        swapped = true;
                    }
                }

                // Записываем текущее состояние массива в лог
                String currentTime = dateFormat.format(new Date());
                String arrayString = Arrays.toString(mas);
                fileWriter.write(currentTime + " " + arrayString + "\n");

                if (!swapped) {
                    break;
                }
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Homework2 {
    public static void main(String[] args) {
        int[] arr = {};
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            arr = new int[]{9, 4, 8, 3, 1};
        } else {
            arr = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * Идеальное решение
 * import java.io.File;
 * import java.io.FileWriter;
 * import java.io.FileReader;
 * import java.io.BufferedReader;
 * import java.io.IOException;
 * import java.util.Arrays;
 * import java.text.SimpleDateFormat;
 * import java.util.Date;
 *
 * class BubbleSort {
 *     private static File log;
 *     private static FileWriter fileWriter;
 *
 *     public static void sort(int[] mas) {
 *         try {
 *             log = new File("log.txt");
 *             log.createNewFile();
 *             fileWriter = new FileWriter(log);
 *             bubbleSort(mas);
 *
 *         } catch (IOException e) {
 *             e.printStackTrace();
 *         } finally {
 *             try {
 *                 fileWriter.close();
 *             } catch (IOException e) {
 *                 e.printStackTrace();
 *             }
 *         }
 *     }
 *
 *     private static int[] bubbleSort(int[] mas) {
 *         boolean isSorted = false;
 *         int buffer;
 *
 *         while (!isSorted) {
 *             isSorted = true;
 *             for (int i = 0; i < mas.length - 1; i++) {
 *                 if (mas[i] > mas[i + 1]) {
 *                     isSorted = false;
 *
 *                     buffer = mas[i];
 *                     mas[i] = mas[i + 1];
 *                     mas[i + 1] = buffer;
 *                 }
 *             }
 *             logStep(Arrays.toString(mas));
 *         }
 *         return mas;
 *     }
 *
 *     public static void logStep(String note){
 *       try {
 *           SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
 *           String timestamp = dateFormat.format(new Date());
 *           fileWriter.write(timestamp + " " + note + "\n");
 *       } catch (IOException e) {
 *           e.printStackTrace();
 *       }
 *   }
 *
 * }
 *
 * public class Homework2{
 *     public static void main(String[] args) {
 *       int[] arr = {};
 *
 *       if (args.length == 0) {
 *         arr = new int[]{9, 4, 8, 3, 1};
 *       }
 *       else{
 *         arr = Arrays.stream(args[0].split(", "))
 *                         .mapToInt(Integer::parseInt)
 *                         .toArray();
 *       }
 *
 *       BubbleSort ans = new BubbleSort();
 *       ans.sort(arr);
 *
 *       try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
 *             String line;
 *             while ((line = br.readLine()) != null) {
 *                 System.out.println(line);
 *             }
 *         } catch (IOException e) {
 *             e.printStackTrace();
 *         }
 *     }
 * }
 */