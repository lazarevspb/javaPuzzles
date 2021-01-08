package jan21;

/*
Напишите функцию, которая разделяет исходную строку s на строки одинакового размера n .
Последний элемент может быть меньше, чем заданный размер.

На входе:

s - исходная строка без пробелов
n - число — заданный размер
На выходе: строка, разделенная на части

Пример:
1.

s = 'wdcerwxcefvwc'
n = 4
getResult( s, n ) --> ''wdce rwxc efvw c'*/

public class task3 {

    public static void main(String[] args) {
//        System.out.println(getResult("wdcerwxcefvwc", 4));
        System.out.println(getResult("geecko", 1));

    }

    public static String getResult(String s, int n) {
        String result = "";
        char[] chars = s.toCharArray();
        int count = n;
        for (int i = 0; i < chars.length; i++) {
            result += chars[i];
            count--;
            if (count == 0 && i != chars.length-1) {
                count = n;
                result += " ";
            }
        }
        return result;
    }

}
