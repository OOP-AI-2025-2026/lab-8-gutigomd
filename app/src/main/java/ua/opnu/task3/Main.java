package ua.opnu.task3;

public class Main {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        System.out.print("Integer Array: ");
        myPrinter.printArray(intArray);

        System.out.print("String Array: ");
        myPrinter.printArray(stringArray);
    }
}