package jan21;

/*
URL адрес может включать в себя

поддомен (например, www)
get параметры (например, ?city=moscow)
якоря (например, #main)
различные пути (например, /home, /index.html)
Напишите функцию, которая возвращает из URL адреса доменное имя сайта

На входе: url - валидный url адрес

На выходе: строка — доменное имя

Пример:

yandex.ru/images/?utm_source=main_stripe_big --> yandex.ru*/

public class task4 {

    public static void main(String[] args) {
        System.out.println(parseUrlDomain("yandex.ru/images/?utm_source=main_stripe_big"));
        System.out.println(parseUrlDomain("www.test1.com?city=moscow&lang=ru"));
        System.out.println(parseUrlDomain("test2.ua#main"));
    }

    public static String parseUrlDomain(String url) {
        String[] split = url.split("[/|?|#]");
        String substring = split[0];
        if (split[0].contains("www.")) {
            substring = split[0].substring(4);
        }

        return substring;
    }
}
