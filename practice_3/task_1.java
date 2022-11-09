
import java.util.Arrays;
import java.util.Comparator;

/*
 * Создать метод, который принимает массив int и сортирует его по последней
 * цифре.
 * Используйте метод Arrays.sort. для его работы создайте свой компаратор
 */

public class task_1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 64, 42, 73, 41, 35, 16, 53, 74, 24, 19, 55, 38 };
        arraySort(new Integer[] { 64, 42, 73, 41, 35, 16, 53, 74, 24, 19, 55, 38 });
    }

    public static void arraySort(Integer[] array) {
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 % 10 - o2 % 10;
            }
        });
        System.out.println(Arrays.toString(array));
    }
}