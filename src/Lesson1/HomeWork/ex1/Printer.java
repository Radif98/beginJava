package Lesson1.HomeWork.ex1;

import java.util.Scanner;

class Answer {
    public int countNTriangle(int n){
        // Введите свое решение ниже
        int ans = 1;
        if (n == 1 || n == 0) {
            return ans;
        }else {
             ans = n + countNTriangle(n - 1);
             return ans;
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите n: ");
            n = scanner.nextInt();
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}
