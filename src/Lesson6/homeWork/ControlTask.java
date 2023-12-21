package Lesson6.homeWork;

import Lesson6.seminar.Cat;

import java.util.*;

public class ControlTask {
    public static void main(String[] args)
    {
        Set<Laptop> laptops = new HashSet<>();
        Laptop laptop1 = new Laptop();
        laptop1.setId("One");
        laptop1.setRam(8);
        laptop1.setVolumeSDD(256);
        laptop1.setOs("macOS");
        laptop1.setDiagonal(14);
        laptop1.setColor("white");
        laptop1.setPrice(50000);

        Laptop laptop2 = new Laptop();
        laptop2.setId("Two");
        laptop2.setRam(16);
        laptop2.setVolumeSDD(512);
        laptop2.setOs("macOS");
        laptop2.setDiagonal(16);
        laptop2.setColor("black");
        laptop2.setPrice(65000);

        Laptop laptop3 = new Laptop();
        laptop3.setId("Three");
        laptop3.setRam(32);
        laptop3.setVolumeSDD(512);
        laptop3.setOs("Windows");
        laptop3.setDiagonal(16);
        laptop3.setColor("blue");
        laptop3.setPrice(44000);

        Laptop laptop4 = new Laptop();
        laptop4.setId("Four");
        laptop4.setRam(8);
        laptop4.setVolumeSDD(256);
        laptop4.setOs("Windows");
        laptop4.setDiagonal(14);
        laptop4.setColor("black");
        laptop4.setPrice(38000);

        Laptop laptop5 = new Laptop();
        laptop5.setId("Five");
        laptop1.setRam(32);
        laptop1.setVolumeSDD(1000);
        laptop1.setOs("macOS");
        laptop1.setDiagonal(16);
        laptop1.setColor("white");
        laptop5.setPrice(85000);


        Laptop laptop6 = new Laptop();
        laptop6.setId("Six");
        laptop6.setRam(16);
        laptop6.setVolumeSDD(512);
        laptop6.setOs("Windows");
        laptop6.setDiagonal(13);
        laptop6.setColor("green");

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);

//        workingWithClient(laptops);
        printSet(filter(workingWithClient(laptops)));

    }

    static Map<Integer, List<Laptop>> workingWithClient(Set<Laptop> laptops)
    {
        Map<Integer, List<Laptop>> firstFilterWorking = new HashMap<>();
        List<Laptop> listLaptop = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                    "1 - Объем ЖД\n" +
                    "2 - OЗУ\n" +
                    "3 - Операционная система\n" +
                    "4 - Размер монитора\n" +
                    "5 - Цвет\n" +
                    "6 - Цена\n" +
                    "7 - поиск");
            int wroteNumber = Integer.parseInt(scanner.nextLine());
            switch (wroteNumber) {
                case 1:
                    System.out.println("Введите желамый объем памяти ЖД: 256ГБ/512ГБ/1000ГБ");
                    int valumeSSD = Integer.parseInt(scanner.nextLine());
                    for (Laptop laptop : laptops) {
                        if (laptop.getVolumeSDD() == valumeSSD) {
                            listLaptop.add(laptop);
                            firstFilterWorking.put(wroteNumber, listLaptop);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Введите желаемый объем ОЗУ: 8/16/32");
                    int valumeRam = Integer.parseInt(scanner.nextLine());
                    for (Laptop laptop : laptops) {
                        if (laptop.getRam() == valumeRam) {
                            listLaptop.add(laptop);
                            firstFilterWorking.put(wroteNumber, listLaptop);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите желаемую ОС: Windows/macOS");
                    String os = scanner.nextLine();
                    for (Laptop laptop : laptops) {
                        if (Objects.equals(laptop.getOs(), os)) {
                            listLaptop.add(laptop);
                            firstFilterWorking.put(wroteNumber, listLaptop);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Введите желаемый размер монитора: 13/14/16");
                    int diagonalLaptop = Integer.parseInt(scanner.nextLine());
                    for (Laptop laptop : laptops) {
                        if (laptop.getDiagonal() == diagonalLaptop) {
                            listLaptop.add(laptop);
                            firstFilterWorking.put(wroteNumber, listLaptop);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Введите желаемый цвет ноутбука: black/white/blue/green");
                    String colorLaptop = scanner.nextLine();
                    for (Laptop laptop : laptops) {
                        if (Objects.equals(laptop.getColor(), colorLaptop)) {
                            listLaptop.add(laptop);
                            firstFilterWorking.put(wroteNumber, listLaptop);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Введите max цена ноутбука в рублях:");
                    int maxPrice = Integer.parseInt(scanner.nextLine());
                    System.out.println("Введите min цена ноутбука в рублях:");
                    int minPrice = Integer.parseInt(scanner.nextLine());
                    for (Laptop laptop : laptops) {
                        if (laptop.getPrice() > minPrice && laptop.getPrice() < maxPrice) {
                            listLaptop.add(laptop);
                            firstFilterWorking.put(wroteNumber, listLaptop);
                        }
                    }
                    break;
                case 7:
                    flag = true;
                    break;
                default:
                    System.out.println("Извините, но вы ввели некорректные данные");
                    break;
            }
        }
        return firstFilterWorking;
    }


    static void printSet(Set<Laptop> laptops)
    {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

    static Set<Laptop> filter(Map<Integer, List<Laptop>> laptops)
    {
        Set<Laptop> laptopSet = new HashSet<>();
        List<Integer> keyList = new ArrayList(laptops.keySet());
        for (int key : keyList) {
            for (Laptop laptop : laptops.get(key)) {
                laptopSet.add(laptop);
            }
        }
        return laptopSet;
    }
}
