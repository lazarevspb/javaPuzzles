package jan21;

/*Напишите функцию, которая возвращает для заданной строки ее средние символы.
Если строка состоит из нечетного количества символов, верните один символ.
Если строка состоит из четного количества символов, верните 2 средних символа.

На входе:

s - строка, длина строки всегда больше 0
На выходе: средние символы строки

Пример:

getMiddle( "abC" ) --> "b"
getMiddle( "abCd" ) --> "bC"*/

public class task7 {
    public static void main(String[] args) {
        System.out.println(getMiddle("abC"));
        System.out.println(getMiddle("abCd"));
        System.out.println(getMiddle("SYlgBNuci"));
        System.out.println(getMiddle("xyRgHVlahU"));
    }

    public static String getMiddle(String s) {
        String result = "";

        char[] chars = s.toCharArray();
        if (chars.length % 2 == 0) {
            result += s.charAt(s.length()/2-1);
            result += s.charAt((s.length()/2));

        } else {
            result += s.charAt(s.length()/2);
        }
        return result;
    }


}
