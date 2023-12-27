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
        laptop6.setPrice(72000);

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);

        printSet(filter(workingWithClient(), laptops));

    }

    static Map<Integer, String> workingWithClient()
    {
        Map<Integer, String> filterWorking = new HashMap<>();
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
            System.out.println("Чувак введи цифру:");
            int wroteNumber = Integer.parseInt(scanner.nextLine());
            switch (wroteNumber) {
                case 1:
                    System.out.println("Введите минимально желаемый объем памяти ЖД: 256ГБ/512ГБ/1000ГБ");
                    String valumeSSD = scanner.nextLine();
                    filterWorking.put(wroteNumber, valumeSSD);
                    break;
                case 2:
                    System.out.println("Введите минимально желаемый объем ОЗУ: 8/16/32");
                    String valumeRam = scanner.nextLine();
                    filterWorking.put(wroteNumber, valumeRam);
                    break;
                case 3:
                    System.out.println("Введите желаемую ОС: Windows/macOS");
                    String oS = scanner.nextLine();
                    filterWorking.put(wroteNumber, oS);
                    break;
                case 4:
                    System.out.println("Введите минимально желаемый размер монитора: 13/14/16");
                    String  diagonalLaptop = scanner.nextLine();
                    filterWorking.put(wroteNumber, diagonalLaptop);
                    break;
                case 5:
                    System.out.println("Введите желаемый цвет ноутбука: black/white/blue/green");
                    String colorLaptop = scanner.nextLine();
                    filterWorking.put(wroteNumber, colorLaptop);
                    break;
                case 6:
                    System.out.println("Введите max цена ноутбука в рублях:");
                    String maxPrice = scanner.nextLine();
                    filterWorking.put(wroteNumber, maxPrice);
                    break;
                case 7:
                    flag = true;
                    break;
                default:
                    System.out.println("Извините, вы ввели совсем не то, чего м ждем от вас;)");
                    break;
            }
        }
        return filterWorking;
    }


    static void printSet(Set<Laptop> laptops)
    {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

    static Set<Laptop> filter(Map<Integer, String> filter, Set<Laptop> laptops)
    {
        Set<Laptop> laptopSet = new HashSet<>();
        List<Integer> keyList = new ArrayList(filter.keySet());
        for (int key : keyList) {
            if (filter.get(key) == null) {
                break;
            }
            else {
                switch (key) {
                    case 1:
                        for (Laptop laptop : laptops) {
                            if(laptop.getVolumeSDD() >= Integer.parseInt(filter.get(key))) {
                               laptopSet.add(laptop);
                            }
                        }
                        laptops.clear();
                        for (Laptop laptop:laptopSet) {
                            laptops.add(laptop);
                        }
                        laptopSet.clear();
                        break;
                    case 2:
                        for (Laptop laptop : laptops) {
                            if(laptop.getRam() >= Integer.parseInt(filter.get(key))) {
                                laptopSet.add(laptop);
                            }
                        }
                        laptops.clear();
                        for (Laptop laptop:laptopSet) {
                            laptops.add(laptop);
                        }
                        laptopSet.clear();
                        break;
                    case 3:
                        for (Laptop laptop : laptops) {
                            if(Objects.equals(laptop.getOs(), filter.get(key))) {
                                laptopSet.add(laptop);
                            }
                        }
                        laptops.clear();
                        for (Laptop laptop:laptopSet) {
                            laptops.add(laptop);
                        }
                        laptopSet.clear();
                        break;
                    case 4:
                        for (Laptop laptop : laptops) {
                            if(laptop.getDiagonal() >= Integer.parseInt(filter.get(key))) {
                                laptopSet.add(laptop);
                            }
                        }
                        laptops.clear();
                        for (Laptop laptop:laptopSet) {
                            laptops.add(laptop);
                        }
                        laptopSet.clear();
                        break;
                    case 5:
                        for (Laptop laptop : laptops) {
                            if(Objects.equals(laptop.getColor(), filter.get(key))) {
                                laptopSet.add(laptop);
                            }
                        }
                        laptops.clear();
                        for (Laptop laptop:laptopSet) {
                            laptops.add(laptop);
                        }
                        laptopSet.clear();
                        break;
                    case 6:
                        for (Laptop laptop : laptops) {
                            if(laptop.getPrice() >= Integer.parseInt(filter.get(key))) {
                                laptopSet.add(laptop);
                            }
                        }
                        laptops.clear();
                        for (Laptop laptop:laptopSet) {
                            laptops.add(laptop);
                        }
                        laptopSet.clear();
                        break;
                }
            }
        }
        return laptops;
    }
}
