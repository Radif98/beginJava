package Lesson5.Seminar;
/*
Взять набор строк, например,

Мороз и солнце день чудесный
Еще ты дремлешь друг прелестный
Пора красавица проснись.

Написать метод, который отсортирует эти слова по длине с помощью TreeMap.
Слова с одинаковой длиной не должны “потеряться”.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args)
    {
        String text = "Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "Пора красавица проснись.";
        System.out.println(lenLetters(text));
    }

    static TreeMap<Integer, List> lenLetters(String s)
    {
        TreeMap<Integer, List> lenWord = new TreeMap<>();
        s = s.replace("\n", " ").replace(".", "");
        String[] arrWords = s.split(" ");
        for (String word : arrWords) {
            int len = word.length();
            if (lenWord.containsKey(len)) {
                lenWord.get(len).add(word);
            } else {
                ArrayList<String> arrLetters = new ArrayList<>();
                arrLetters.add(word);
                lenWord.put(len, arrLetters);
            }
        }
        return lenWord;
    }
}
