package Lesson4.Seminar;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4"};
        printAsQueue(arr);
    }

    static void printAsQueue(String[] arr){
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(arr));

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    static void printAsStack(String[] arr){
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));

//        System.out.println(stack);

//        for (String s: stack){
//            System.out.println(s);
//        }

        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}