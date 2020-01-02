import java.util.NoSuchElementException;

public class MyStack<T> {
    private MyStackNode<T> top;

    public MyStack(MyStackNode<T> top) {
        this.top = top;
    }

    public MyStack() {
        this.top = null;
    }

    public void push(T value){
        if(value == null){
            throw new NullPointerException();
        }
        var newStackItem = new MyStackNode<T>(value);
        if(top == null){
            top = newStackItem;
        }
        else{
            newStackItem.setNext(top);
            top = newStackItem;
        }
    }

    public T pop(){
        if(top == null){
            throw new NoSuchElementException();
        }
        T topValue = top.getData();
        top = top.getNext();
        return topValue;
    }

    public T peek(){
        if(top == null){
            throw new NoSuchElementException();
        }
        return top.getData();
    }

    public boolean isEmpty(){
        return top == null;
    }
}
