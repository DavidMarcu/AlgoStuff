import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyStackTests {

    private MyStack<Integer> target;

    @BeforeEach
    public void setup(){
        target = new MyStack<>();
    }

    @Test
    public void checkPushPopOperations(){
        target.push(1);
        target.push(2);
        target.push(3);
        target.push(4);
        target.push(5);
        Assertions.assertEquals(target.pop(), 5);
        Assertions.assertEquals(target.peek(), 4);
    }
}
