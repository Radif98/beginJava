package Lesson5.Seminar;
/*
Создать структуру для хранения Номеров паспортов
и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
 */

public class Task1 {
    public static void main(String[] args)
    {
        Passports passports = new Passports();
        passports.addPassport("123456", "Иванов");
        passports.addPassport("321456", "Васильев");
        passports.addPassport("234561", "Петрова");
        passports.addPassport("234432", "Иванов");
        passports.addPassport("654321", "Петрова");
        passports.addPassport("345678", "Иванов");
        String idName = passports.seach("Иванов");
        System.out.println(idName);
    }
}
