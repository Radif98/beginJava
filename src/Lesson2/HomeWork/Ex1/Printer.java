package Lesson2.HomeWork.Ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS)
    {
        // Напишите свое решение ниже
        StringBuilder stringBuilder = new StringBuilder(QUERY);
        Map<String, String> dictionary = new HashMap<String, String>();
        String checkWord = "null";
        PARAMS = PARAMS.replace("{", "");
        PARAMS = PARAMS.replace("}", "");
        PARAMS = PARAMS.replace(",", ":");
        PARAMS = PARAMS.replace('"', '_');
        PARAMS = PARAMS.replace("_", "");
        PARAMS = PARAMS.replace(" ", "");
        String[] params = PARAMS.split(":");
        for (int i = 0; i < params.length - 1; i++) {
            if (params[i] != " ") {
                dictionary.put(params[i], params[i + 1]);
                i++;
            }
        }
        for (int i = 0; i < params.length - 1; i++) {
            boolean flag = false;
            if (Objects.equals(dictionary.get(params[i]), checkWord)) {
                flag = true;
            }if (!flag) {
                stringBuilder.append(params[i]);
                stringBuilder.append("=");
                stringBuilder.append("'");
                stringBuilder.append(dictionary.get(params[i]));
                stringBuilder.append("'");
                if (dictionary.get(params[i]) == params[params.length - 1] || Objects.equals(dictionary.get(params[i + 2]), checkWord)) {
                    flag = true;
                }else {
                    stringBuilder.append(" ");
                    stringBuilder.append("and");
                    stringBuilder.append(" ");
                }
                i++;
            }

        }
        return stringBuilder;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}