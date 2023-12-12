package Lesson4.Seminar;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Scanner scaner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            String text = scaner.nextLine();
            switch (text) {
                case "print":
                    for (String item: list) {
                        System.out.println(item);
                    }
//                    ListIterator<String> iterator = list.listIterator(list.size());
//                    while (iterator.hasPrevious()) {
//                        System.out.println(iterator.previous());
//                    }
//                    for (int i = list.size() - 1; i >= 0; i--) {
//                        System.out.println(list.get(i));
//                    }
                    break;
                case "stop":
                    flag = false;
                    break;
                case "revert":
                    list.remove(0);
//                    list.remove(list.size() - 1);
                    break;
                default:
                    list.add(0, text);
//                    list.add(text);
            }

        }
    }
}
