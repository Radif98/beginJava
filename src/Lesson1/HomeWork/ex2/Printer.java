package Lesson1.HomeWork.ex2;

import java.security.KeyStore;

class Answer {
    public void printPrimeNums()
    {
        // Напишите свое решение ниже
        for (int i = 2; i < 1000; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}



// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args)
    {
        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}
