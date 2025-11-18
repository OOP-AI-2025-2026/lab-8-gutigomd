package ua.opnu.task6;

public class GenericThreeTuple<T, V, S> {

    private final GenericTwoTuple<T, V> twoTuple;
    public final S three;

    public GenericThreeTuple(T first, V second, S three) {
        this.twoTuple = new GenericTwoTuple<>(first, second);
        this.three = three;
    }

    public T getFirst() { return twoTuple.first; }
    public V getSecond() { return twoTuple.second; }
    public S getThird() { return three; }

    @Override
    public String toString() {
        String twoStr = twoTuple.toString();
        String content = twoStr.substring(1, twoStr.length() - 1);

        return "(" + content + ", " + three + ")";
    }
}
