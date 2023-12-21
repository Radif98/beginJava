package Lesson5.Seminar;
/*
Даны 2 строки, написать метод, который вернет true,
если эти строки являются изоморфными и false, если нет.
Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове,
при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
(Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true
 */

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args)
    {
        System.out.println(isIsomorphic("add", "egg"));
        System.out.println(isIsomorphic("note", "code"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("bar", "foo"));
    }

    static boolean isIsomorphic(String s1, String s2)
    {
        Map<Character, Character> word = new HashMap<>();
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (word.containsKey(s1.charAt(i))) {
                if (word.get(s1.charAt(i)) != s2.charAt(i)) {
                    return false;
                }
            } else {
                if (word.containsValue(s2.charAt(i))) {
                    return false;
                }
                word.put(s1.charAt(i), s2.charAt(i));
            }
        }
        return true;
    }
}
