package jan21;

/*
В ленте новостей в соцсети решили выводить фильмы, которые смотрели ваши друзья. У каждого фильма должна быть подпись
вида "Vasia, Andrey and Lena watched this film". Чтобы не занимать много места, строку следует формировать согласно
следующим правилам:

на вход подается массив друзей, смотревших фильм (friends)
если элементов больше двух, последний элемент отделяется от предпоследнего с помощью слова and
все предыдущие элемента отделяют друг от друга запятыми
если элементов больше 4, то выводится только три друга, и следующим элементом добавляется фраза "n others",
где n - количество оставшихся друзей (n = fiends.length - 3), остальные элементы не добавляются
На входе:

friends - массив строк ненулевой длины, friends.length > 0
На выходе: строка

Пример:
1.

friends = ['Vasia', 'Petya', 'Andrey', 'Valera', 'Sonya']
getResult( friends ) -> 'Vasia, Petya, Andrey and 2 others watched this film'
2.

friends = ['Vasia', 'Petya']
getResult( friends ) -> 'Vasia and Petya watched this film'
 */


import java.util.Arrays;
import java.util.List;

public class task5 {
    public static void main(String[] args) {
//        System.out.println(getResult(Arrays.asList("Vasia", "Petya", "Andrey", "Valera", "Sonya")));
//        System.out.println(getResult(Arrays.asList("Vasia", "Petya")));//"Anton and Vasya watched this film"
//        System.out.println(getResult(Arrays.asList("Olga", "Vova", "Lena", "Dasha"))); //"Olga, Vova, Lena and Dasha watched this film"
        System.out.println(getResult(Arrays.asList("Petya"))); //"Petya watched this film"
    }

    public static String getResult(List<String> friends) {
        String s = "";
        if (friends.size() > 4) {
            for (int i = 0; i < friends.size(); i++) {
                if (i < 3) {
                    s += friends.get(i) + ", ";
                } else {
                    s = s.substring(0, s.length() - 2) + " ";
                    s += "and " + (friends.size() - 3) + " others watched this film";
                    break;
                }
            }

        } else if (friends.size() < 3) {
            for (int i = 0; i < friends.size(); i++) {
                if (i < 3) {
                    if(i == 0) {
                        s += friends.get(i) + " and ";
                    } else s += friends.get(i);
                }
            }
            if (friends.size() == 1) {
                s = s.substring(0, s.length() - 5);
            }
            s = s.substring(0, s.length() - 0) + " watched this film";


        } else if (friends.size() == 4) {
            for (int i = 0; i < friends.size(); i++) {
                if (i < 3) {
                    s += friends.get(i) + ", ";

                }else {
                    s = s.substring(0, s.length() - 2) + " ";
                    s += "and " + friends.get(friends.size() - 1);
                }
            }
            s = s.substring(0, s.length() - 0) + " watched this film";

        }
        return s;
    }


}
