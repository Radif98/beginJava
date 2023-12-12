package Lesson4.HomeWork.Ex2;

import java.util.*;

class MyQueue<T> {
    // Напишите свое решение ниже
    Queue<Integer> queue = new LinkedList<>();
    public void enqueue(T element){
        // Напишите свое решение ниже
        queue.add((Integer) element);
    }

    public T dequeue(){
        // Напишите свое решение ниже
        queue.poll();
        return null;
    }

    public int first(){
        // Напишите свое решение ниже
        int firstEl;
        firstEl = queue.peek();
        return firstEl;
    }

    public List<Integer> getElements() {
        // Напишите свое решение ниже
        return (List<Integer>) queue;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

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