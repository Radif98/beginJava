package Lesson5.Seminar;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task3 {
    /*
    Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 2: [a+(1]*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
     */
    public static void main(String[] args)
    {
        System.out.println(checkBrackets("a+(d*3)"));
        System.out.println(checkBrackets("[a+(1*3)"));
        System.out.println(checkBrackets("[a+(1]*3)"));
        System.out.println(checkBrackets("[6+(3*3)]"));
        System.out.println(checkBrackets("{a}[+]{(d*3)}"));
        System.out.println(checkBrackets("<{a}+{(d*3)}>"));
    }
    static boolean checkBrackets(String s)
    {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('<', '>');
        map.put('{', '}');
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            }
            if (map.containsValue(c)) {
                if (stack.empty() || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
