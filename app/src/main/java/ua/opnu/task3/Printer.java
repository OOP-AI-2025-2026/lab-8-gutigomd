package ua.opnu.task3;

public class Printer {

    public <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
