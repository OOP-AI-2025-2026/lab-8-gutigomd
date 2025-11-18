package ua.opnu.task5;

public class SearchUtils {

    public static <T extends Comparable<T>, V extends T> boolean contains(T[] array, V element) {
        for (T item : array) {
            if (item != null && item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] strArray = {"Java", "Python", "C++"};
        System.out.println("Contains Java? " + contains(strArray, "Java"));
        System.out.println("Contains Ruby? " + contains(strArray, "Ruby"));
    }
}
