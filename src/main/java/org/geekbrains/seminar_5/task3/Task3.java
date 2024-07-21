package org.geekbrains.seminar_5.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Написать программу, определяющую правильность расстановки скобок в выражении.
 * Пример 1: a+(d*3) - истина
 * Пример 2: [a+(1*3) - ложь
 * Пример 3: [6+(3*3)] - истина
 * Пример 4: {a}[+]{(d*3)} - истина
 * Пример 5: <{a}+{(d*3)}> - истина
 * Пример 6: {a+]}{(d*3)} - ложь
 */
public class Task3 {
    public static void main(String[] args) {
        Map<Character, Character> pair = new HashMap<>();
        pair.put('(', ')');
        pair.put('[', ']');
        pair.put('{', '}');
        pair.put('<', '>');
        Stack<Character> lifo = new Stack<>();
        String srs = "{a+]}{(d*3)}";
        System.out.println("conditionPairs(srs, pair, lifo) = " + conditionPairs(srs, pair, lifo));
    }

    private static boolean conditionPairs(String srs, Map<Character, Character> pair, Stack<Character> lifo) {
        for (char c : srs.toCharArray()) { //пробегает по всем вариантам из примера
            if (pair.containsKey(c)) { //если у нас скобка, то
                lifo.push(c);  //она добавляется
            } else if (pair.containsValue(c)) {
                if (lifo.isEmpty() || pair.get(lifo.pop()) != c) {
                    return false;
                }
            }
        }
        return lifo.isEmpty();
    }
}
