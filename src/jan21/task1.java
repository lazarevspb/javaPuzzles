package jan21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {
      /*
Дан массив целых чисел arr. Напишите функцию, которая суммирует одинаковые
последовательные числа в данном массиве.
На входе:
arr - массив целых чисел
На выходе: преобразованный массив
Пример:
arr = [1, 2, 2, 4, 5, 5, 5]
getResult(arr) --> [1, 4, 4, 15]
*/

    public static void main(String[] args) {
        List<Integer> result1 = new ArrayList<>();
        result1.addAll(Arrays.asList(1, 2, 2, 4, 5, 5, 5));
        System.out.println(getResult(result1));
    }

    public static List<Integer> getResult(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        int count = 0;
        while (!(count == arr.size())) {
            int finalI = count;

            result.add(arr.stream()
                    .skip(count)
                    .filter(integer -> integer == arr.get(finalI))
                    .reduce(Integer::sum)
                    .orElse(arr.get(finalI)));

            count += (int) arr.stream()
                    .skip(count)
                    .filter(integer -> integer == arr.get(finalI))
                    .count();
        }
        return result;
    }

}
