package jan21;

/*

Дан массив arr и целое число n. Переставьте все элементы массива таким образом,
чтобы выполнялись следующие условия:

все элементы, которые меньше n, помещаются перед элементами, которые не меньше n;
все элементы, которые меньше n, остаются в том же порядке относительно друг друга;
все элементы, которые не меньше n, остаются в том же порядке относительно друг друга.
На входе:

arr - массив чисел
n - целое число
На выходе: массив чисел

Пример:

arr =                     [3, 2, 7, 8, 1, 7, 3]
n = 3
rearrange( arr, n ) -->   [2, 1, 3, 7, 8, 7, 3]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task6 {

    public static void main(String[] args) {
        System.out.println(rearrange(Arrays.asList(3, 2, 7, 8, 1, 7, 3), 3));
    }

    public static List<Integer> rearrange(List<Integer> arr, int k) {
        List<Integer> result;
        List<Integer> tmp = new ArrayList<>();
        tmp.addAll(arr);
        result =    arr.stream().filter(integer -> integer < k).collect(Collectors.toList());
        tmp.removeAll(result);
        result.addAll(tmp);
        return result;
    }

}
