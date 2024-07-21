package org.geekbrains.seminar6.task4;

/**
 * 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
 * Поместите в него некоторое количество объектов.
 * 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
 * Убедитесь, что все они сохранились во множество.
 * 3. Создайте метод public boolean equals(Object o)
 * Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
 * должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
 * 4. Создайте метод public int hashCode()
 * который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
 * Objects.hash(...))
 * 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.id = 1;
        cat1.name = "Mimi";
        cat1.color = "black";
        cat1.age = 2;
        cat1.ovner = "Tom";

        Cat cat2 = new Cat();
        cat2.id = 2;
        cat2.name = "Barsik";
        cat2.color = "red";
        cat2.age = 3;
        cat2.ovner = "Ivan";

        System.out.println(Arrays.asList(cat1, cat2));

        Set<Cat> cats = new HashSet<>(Arrays.asList(cat1, cat2, cat1));
        System.out.println(cats);
        System.out.println(cat1.equals(cat2));

        HashSet<Cat> cats2 = new HashSet<>();
//        cats2.add(cat1);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            cats2.add(new Cat());
        }
        long end = System.currentTimeMillis();
        System.out.println("Время создания: " + (end - start));
        start = System.currentTimeMillis();

        for (int i = 0; i < 10_000; i++){
            cats2.contains(i);

        }
        end = System.currentTimeMillis();
        System.out.println("Время проверки: " + (end - start));
    }

}
