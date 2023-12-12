package Lesson3.HomeWork.Ex1;

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a)
    {
        // Напишите свое решение ниже
        if (a == null) {
            return null;
        }
        if (a.length < 2) {
            return a;
        }
        int[] b = new int[a.length/2];
        System.arraycopy(a, 0, b, 0, a.length/2);
        int[] c = new int[a.length - a.length/2];
        System.arraycopy(a, a.length/2, c, 0, a.length - a.length/2);
        b = mergeSort(b);
        c = mergeSort(c);
        int intArrB = 0;
        int intArrC = 0;
        for (int i = 0; i < a.length; i++) {
            if (b.length == intArrB) {
                a[i] = c[i - intArrB];
                intArrC++;
            } else if (c.length == intArrC) {
                a[i] = b[i - intArrC];
                intArrB++;
            } else if ((b[intArrB] < c[intArrC])) {
                a[i] = b[intArrB];
                intArrB++;
            } else {
                a[i] = c[intArrC];
                intArrC++;
            }
        }
        return a;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args)
    {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}