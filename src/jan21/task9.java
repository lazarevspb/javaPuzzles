package jan21;

/*
Напишите функцию, которая принимает строку в camelCase и преобразует ее в snake_case (в нижнем регистре).
На входе:

s - строка в camelCase
На выходе:  строка в snake_case

Пример:

getResult( "camelCase" ) --> "camel_case"*/

public class task9 {

    public static void main(String[] args) {
        System.out.println(getResult("camelCase"));
        System.out.println(getResult("camelCaseFase"));
        System.out.println(getResult(""));
        System.out.println(getResult(null));
    }

    public static String getResult(String s) {
        if (s == null) return "";
        if (s.equals("")) return "";
        String result = "";
        String tmp = "";
        String tmp2 = "";

        for (int j = 0; j < 2; j++) {
            result = s.replaceAll("[A-Z]", "#");
            int i = 0;
            if (result.contains("#")) {
                i = result.indexOf("#");
                s = s.replace(s.charAt(i), Character.toLowerCase(s.charAt(i)));

                tmp = s.substring(0, i) + "_";
                tmp += s.substring(i);
                if (j == 0) {
                    tmp2 = tmp;
                } else tmp2 = tmp2.substring(0, i + 1) + tmp.substring(i);
            }
        }
        return tmp2;
    }


}
