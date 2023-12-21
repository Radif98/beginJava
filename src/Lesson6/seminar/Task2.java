package Lesson6.seminar;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args)
    {
        Set<Cat> cats = new HashSet<>();

        Cat cat1 = new Cat();
        cat1.setName("Псюк");
        cat1.setAge(3);
        cat1.setPoroda("Дворняга");
        cat1.setOwner("Гульназ Нагимована");

        Cat cat2 = new Cat();
        cat2.setName("Рыжик");
        cat2.setAge(2);
        cat2.setPoroda("Эльф");
        cat2.setOwner("Айназ Рамилевна");

        Cat cat3 = new Cat();
        cat3.setName("Барсук");
        cat3.setAge(6);
        cat3.setPoroda("Сфинкс");
        cat3.setOwner("Рифа Юсуповна");

//        System.out.println(cat1);

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        printSet(cats);
        System.out.println();
        printSet(findByAge(cats, 3));
    }
    static void printSet(Set<Cat> cats) {
        for (Cat cat: cats) {
            System.out.println(cat);
        }
    }
    static Set<Cat> findByAge(Set<Cat> cats, int minAge) {
        Set<Cat> res = new HashSet<>();
        for (Cat cat: cats) {
            if (cat.getAge() >= minAge) {
                res.add(cat);
            }
        }
        return res;
    }

}
