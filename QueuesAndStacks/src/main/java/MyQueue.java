public class MyQueue<T> {

    private MyStack<T> stackInOrder;
    private MyStack<T> stackReverseOrder;

    public MyQueue(){
        stackInOrder = new MyStack<>();
        stackReverseOrder = new MyStack<>();
    }

    public void enqueue(T newItem){
        while(!stackInOrder.isEmpty()){
            stackReverseOrder.push(stackInOrder.pop());
        }
        stackReverseOrder.push(newItem);
    }

    public T dequeue(){
        while (!stackReverseOrder.isEmpty()){
            stackInOrder.push(stackReverseOrder.pop());
        }
        return stackInOrder.pop();
    }

    public T peek(){
        while (!stackReverseOrder.isEmpty()){
            stackInOrder.push(stackReverseOrder.pop());
        }
        return stackInOrder.peek();
    }

    public boolean isEmpty(){
        return stackInOrder.isEmpty() && stackReverseOrder.isEmpty();
    }
}
