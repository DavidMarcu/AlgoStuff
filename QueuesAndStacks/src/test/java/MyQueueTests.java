import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyQueueTests {

    private MyQueue<Integer> target;

    @BeforeEach
    public void setup(){
        target = new MyQueue<>();
    }

    @Test
    public void queueOperationsTest(){
        target.enqueue(1);
        target.enqueue(2);
        target.enqueue(3);
        target.enqueue(4);
        target.enqueue(5);
        Assertions.assertEquals(target.dequeue(), 1);
        Assertions.assertEquals(target.peek(), 2);
    }
}
