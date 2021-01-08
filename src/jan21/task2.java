package jan21;

/*Вам дается строка  digits, состоящая из чисел, разделенных пробелами.
Напишите функцию, которая возвращает наибольшее и наименьшее числа этой строки, разделенные пробелами (первым идет наибольшее).
На входе:
digits - строка, состоящая из чисел, состоит как минимум из одного числа
На выходе: строка (наибольшее и наименьшее число)
Пример:
getResult( "2 -1 5 10 4 1" ) --> "10 -1"*/

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        System.out.println(getResult("2 -1 5 10 4 1"));
    }

    public static String getResult(String digits) {
        int[] tmp;
        String[] sArr = digits.split(" ");
        tmp = Arrays.stream(sArr).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(tmp);
        int max = tmp[tmp.length - 1];
        int min = tmp[0];
        return max + " " + min;
    }

}
