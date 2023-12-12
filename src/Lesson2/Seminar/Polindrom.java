package Lesson2.Seminar;

/*Напишите метод, который принимает на вход строку (String)
и определяет является ли строка палиндромом
(возвращает boolean значение).
 */
public class Polindrom {
    public static void main(String[] args)
    {
        System.out.println(polindromV2("А роза упала на лапу Азора"));
    }

    /*
    static boolean polindrom(String str)
    {
        str = str.toLowerCase();
        str = str.replace(" ", "");
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
     */

    static boolean polindromV2(String str)
    {
        str = str.toLowerCase();
        str = str.replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(str);
    }

}
