package org.geekbrains.seminar_5.homework2;
/**
 * Подсчет повторяющихся имен
 * Вы работаете с приложением для учета имен пользователей. Ваша задача - разработать программу, которая принимает на вход пять имен пользователей (или использует имена по умолчанию, если аргументы не предоставлены) и подсчитывает, сколько раз каждое имя встречается.
 * Программа должна использовать HashMap для хранения имен и их количества вхождений.
 * По завершении, программа выводит результат в виде пар "имя - количество".
 * <p>
 * На входе:
 * <p>
 * <p>
 * 'Elena'
 * 'Elena'
 * 'Elena'
 * 'Ivan'
 * 'Ivan'
 * На выходе:
 * <p>
 * <p>
 * {Ivan=2, Elena=3}
 */

import java.util.HashMap;

class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        names.put(name, names.getOrDefault(name, 0) + 1);
    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        System.out.println(names);
    }
}

// Не удаляйте и не меняйте метод Main!
public class Homework2 {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        String name4;
        String name5;

        if (args.length == 0) {
            name1 = "Elena";
            name2 = "Elena";
            name3 = "Elena";
            name4 = "Elena";
            name5 = "Ivan";
        } else {
            name1 = args[0];
            name2 = args[1];
            name3 = args[2];
            name4 = args[3];
            name5 = args[4];
        }
        NamesCounter namesCounter = new NamesCounter();

        namesCounter.addName(name1);
        namesCounter.addName(name2);
        namesCounter.addName(name3);
        namesCounter.addName(name4);

        namesCounter.addName(name5);

        namesCounter.showNamesOccurrences();
    }
}

/**
 * Идеальное решение
 *

 import java.util.HashMap;

 class NamesCounter {
 private HashMap<String, Integer> names = new HashMap<>();

 // Метод для добавления имени в HashMap
 public void addName(String name) {
 if (names.containsKey(name)) {
 names.put(name, names.get(name) + 1);
 } else {
 names.put(name, 1);
 }
 }

 // Метод для вывода содержимого HashMap
 public void showNamesOccurrences() {
 System.out.println(names);
 }
 }

 public class Printer {
 public static void main(String[] args) {
 String name1;
 String name2;
 String name3;
 String name4;
 String name5;

 if (args.length == 0) {
 name1 = "Elena";
 name2 = "Elena";
 name3 = "Elena";
 name4 = "Elena";
 name5 = "Ivan";
 } else {
 name1 = args[0];
 name2 = args[1];
 name3 = args[2];
 name4 = args[3];
 name5 = args[4];
 }
 NamesCounter namesCounter = new NamesCounter();

 namesCounter.addName(name1);
 namesCounter.addName(name2);
 namesCounter.addName(name3);
 namesCounter.addName(name4);

 namesCounter.addName(name5);

 namesCounter.showNamesOccurrences();
 }
 }
 */