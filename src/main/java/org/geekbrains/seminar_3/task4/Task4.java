package org.geekbrains.seminar_3.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Пройти по списку из предыдущего задания и удалить
 * повторяющиеся элементы.
 */
public class Task4 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = scanner.nextInt();
        List<String> rndPlanets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rndPlanets.add(planets.get((int) ((Math.random() * planets.size()))));
        }
        System.out.println(rndPlanets);
        Collections.sort(rndPlanets);
        int count = 1;
        for (int i = 1; i < rndPlanets.size(); i++) {
            if (rndPlanets.get(i).equals(rndPlanets.get(i - 1))) {
                count++;
            } else {
                System.out.println(rndPlanets.get(i) + " Встретилась " + count + " раз");
                count = 1;
            }
        }
        System.out.println(rndPlanets.get(rndPlanets.size() - 1) + " Встретилась " + count + " раз");
        List<String> unicList = new ArrayList<>();
        for (int i = 1; i < rndPlanets.size(); i++) {
            if (!rndPlanets.get(i).equals(rndPlanets.get(i - 1))) {
                unicList.add(rndPlanets.get(i - 1));
            }
        }
        System.out.println(unicList);
        scanner.close();
    }
}


