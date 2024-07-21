package org.geekbrains.finalWork;

import java.util.*;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * <p>
 * -Создать множество ноутбуков.
 * -Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
 * Например:
 * Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * -Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * -Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class FinalWork {
    public static void main(String[] args) {
        LaptopStore store = new LaptopStore();
        store.generateLaptops(100);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Магазин ноутбуков =====");
            System.out.println("1. Показать все ноутбуки");
            System.out.println("2. Отфильтровать ноутбуки");
            System.out.println("0. Выйти");
            System.out.print("Выберите действие: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    store.displayAllLaptops();
                    break;
                case 2:
                    store.filterLaptops();
                    break;
                case 0:
                    System.out.println("До свидания! Программа подготовлена студентом GB Павел О. Преподаватель Вороновский Роман.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

