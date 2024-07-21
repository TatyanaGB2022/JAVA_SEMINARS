package org.geekbrains.seminar_4.task5;

/**
 * Реализовать стэк с помощью массива.
 * Нужно реализовать методы:
 * size(), empty(), push(), peek(), pop().
 */
public class Task5 {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);
        System.out.println("arrayStack.size() = " + arrayStack.size());
        arrayStack.push("1");
        arrayStack.push("2");
        arrayStack.push("3");
        System.out.println("arrayStack.peek() = " + arrayStack.peek());
        System.out.println("arrayStack.pop() = " + arrayStack.pop());
        System.out.println("arrayStack.peek() = " + arrayStack.peek());
        System.out.println("arrayStack.empty() = " + arrayStack.empty());
        System.out.println("arrayStack.size() = " + arrayStack.size());
    }
}
