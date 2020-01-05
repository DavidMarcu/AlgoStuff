public class Pair<T1, T2> {
    private T1 index;
    private T2 value;

    public Pair(T1 index, T2 value) {
        this.index = index;
        this.value = value;
    }

    public T1 getIndex() {
        return index;
    }

    public T2 getValue() {
        return value;
    }
}
