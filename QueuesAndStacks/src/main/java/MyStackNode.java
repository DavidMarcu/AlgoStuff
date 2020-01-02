public class MyStackNode<T> {
    private T data;
    private MyStackNode<T> next;

    public MyStackNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setNext(MyStackNode<T> next) {
        this.next = next;
    }

    public MyStackNode<T> getNext() {
        return next;
    }
}
