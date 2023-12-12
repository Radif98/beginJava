package Lesson3.Seminar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Создать список типа ArrayList
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */
public class Task2 {
    public static void main(String[] args)
    {
        List<Object> arr = new ArrayList<>();

        arr.add("fgdg");
        arr.add(6);
        arr.add(7);
        arr.add(9.8);
        arr.add("fgdgfgfgd");
        arr.add("fgdg565");

        System.out.println(arr);

//        for (int i = arr.size() - 1; i >= 0 ; i--) {
//            if (arr.get(i) instanceof Integer) {
//                arr.remove(i);
        Iterator<Object> iterator = arr.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            if (object instanceof Integer){
                iterator.remove();
            }
        }
        System.out.println(arr);
    }
}
