package org.geekbrains.seminar_4.homework_2;

/**
 * Реализация очереди
 * В классе MyQueueInt реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:
 *
 * enqueue() - помещает элемент в конец очереди
 * dequeue() - возвращает первый элемент из очереди и удаляет его
 * first() - возвращает первый элемент из очереди, не удаляя
 * getElements() - возвращает все элементы в очереди
 * Пример
 *
 *
 * queue.enqueue(1);
 * queue.enqueue(10);
 * queue.enqueue(15);
 * queue.enqueue(5);
 * System.out.println(queue.getElements());
 */
import java.util.LinkedList;

class MyQueueInt {
    private LinkedList<Integer> elements;

    public MyQueueInt() {
        elements = new LinkedList<>();
    }

    public void enqueue(int element) {
        elements.addLast(element);
    }

    public int dequeue() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.removeFirst();
    }

    public int first() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.getFirst();
    }

    public LinkedList<Integer> getElements() {
        return new LinkedList<>(elements);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Homework2 {
    public static void main(String[] args) {
        MyQueueInt queue;
        queue = new MyQueueInt();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
/**
 * Идеальное решение
 * import java.util.LinkedList;
 *
 * class MyQueueInt {
 *     private LinkedList<Integer> elements = new LinkedList<>();
 *
 *     public void enqueue(int element) {
 *         elements.add(element);
 *     }
 *
 *     public int dequeue() {
 *         return elements.removeFirst();
 *     }
 *
 *     public int first() {
 *         return elements.getFirst();
 *     }
 *
 *     public LinkedList<Integer> getElements() {
 *         return elements;
 *     }
 * }
 *
 * // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
 * public class Printer {
 *     public static void main(String[] args) {
 *         MyQueueInt queue;
 *         queue = new MyQueueInt();
 *
 *         if (args.length == 0) {
 *         // При отправке кода на Выполнение, вы можете варьировать эти параметры
 *             queue.enqueue(1);
 *             queue.enqueue(10);
 *             queue.enqueue(15);
 *             queue.enqueue(5);
 *         } else {
 *             queue.enqueue(Integer.parseInt(args[0]));
 *             queue.enqueue(Integer.parseInt(args[1]));
 *             queue.enqueue(Integer.parseInt(args[2]));
 *             queue.enqueue(Integer.parseInt(args[3]));
 *         }
 *
 *         System.out.println(queue.getElements());
 *
 *         queue.dequeue();
 *         queue.dequeue();
 *         System.out.println(queue.getElements());
 *
 *         System.out.println(queue.first());
 *     }
 * }
 */