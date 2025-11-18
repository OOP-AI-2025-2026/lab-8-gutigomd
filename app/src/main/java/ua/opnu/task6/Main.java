package ua.opnu.task6;

public class Main {
    public static void main(String[] args) {
        GenericTwoTuple<String, Integer> person = new GenericTwoTuple<>("Олексій", 25);
        System.out.println("TwoTuple: " + person);

        GenericThreeTuple<String, Integer, Double> student =
                new GenericThreeTuple<>("Марія", 20, 95.5);

        System.out.println("ThreeTuple: " + student);
        System.out.println("Ім'я з ThreeTuple: " + student.getFirst());
    }
}
