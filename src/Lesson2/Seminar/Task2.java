package Lesson2.Seminar;

import java.util.Scanner;

/*
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
Результат: a4b3cd2
 */
public class Task2 {
    public static void main(String[] args)
    {
        String text = "aaaabbbcdd";
        System.out.println(zipText(text));
    }

    static String zipText(String text)
    {
        int count = 1;
        StringBuilder zipText = new StringBuilder();
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                count++;
            } else {
                zipText.append(text.charAt(i));
                if (count != 1) {
                    zipText.append(count);
                }
                count = 1;
            }
        }
        zipText.append(text.charAt(text.length() - 1));
        if (count != 1) {
            zipText.append(count);
        }
        return zipText.toString();
    }
}
