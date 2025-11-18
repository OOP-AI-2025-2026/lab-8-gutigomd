package ua.opnu.task4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class FilterUtils {

    @SuppressWarnings("unchecked")
    public static <T> T[] filter(T[] input, Predicate<T> p, Class<T> clazz) {
        T[] result = (T[]) Array.newInstance(clazz, input.length);

        int counter = 0;
        for (T i : input) {
            if (p.test(i)) {
                result[counter] = i;
                counter++;
            }
        }
        return Arrays.copyOf(result, counter);
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        Integer[] evens = filter(numbers, n -> n % 2 == 0, Integer.class);
        System.out.println(Arrays.toString(evens));

        String[] words = {"apple", "banana", "pear", "kiwi"};
        String[] longWords = filter(words, s -> s.length() > 4, String.class);
        System.out.println(Arrays.toString(longWords));
    }
}