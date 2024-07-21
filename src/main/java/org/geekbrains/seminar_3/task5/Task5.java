package org.geekbrains.seminar_3.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * Каталог товаров книжного магазина сохранен в виде двумерного
 * списка List<ArrayList<String>> так, что на 0й позиции каждого
 * внутреннего списка содержится название жанра, а на остальных
 * позициях - названия книг. Напишите метод для заполнения данной
 * структуры.
 */
public class Task5 {
    public static void main(String[] args) {
        List<ArrayList<String>> bookCatalog = new ArrayList<>();
        addHeader(bookCatalog, "Proza", new String[]{"1", "2", "3"});
        addHeader(bookCatalog, "Fantasy", new String[]{"1", "2", "3"});
       // System.out.println(bookCatalog);
        for (ArrayList<String> ganre : bookCatalog) {
            System.out.println("Ganre = " + ganre.get(0));
            System.out.println("Список книг = ");
            for (int i = 1; i < ganre.size(); i++) {
                System.out.printf(ganre.get(i) + " ");
                System.out.println();
            }

        }
    }

    public static void addHeader(List<ArrayList<String>> bookCatalog, String genre, String[] book) {
        ArrayList<String> list = new ArrayList<>();
        list.add((genre));
        for (int i = 0; i < book.length; i++) {
            list.add(book[i]);
        }
        bookCatalog.add(list);
    }
}
