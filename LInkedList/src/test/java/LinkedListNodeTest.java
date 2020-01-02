import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListNodeTest {

    private LinkedListNode target;

    @Test
    public void testSmallCaseAddWithValue(){
        target = new LinkedListNode(1);
        target.add(2);
        target.add(3);
        Assertions.assertEquals(target.getValue(), 1);
        Assertions.assertEquals(target.getNext().getValue(), 2);
        Assertions.assertEquals(target.getNext().getNext().getValue(), 3);
    }

    @Test
    public void testBiggerCaseAddWithValue(){
        target = new LinkedListNode(1);
        target.add(2);
        target.add(3);
        target.add(1);
        target.add(2);
        target.add(3);
        target.add(1);
        target.add(2);
        target.add(3);
        Assertions.assertEquals(target.getValue(), 1);
        Assertions.assertEquals(target.getNext().getValue(), 2);
        Assertions.assertEquals(target.getNext().getNext().getValue(), 3);
        Assertions.assertEquals(target.getNext().getNext().getNext().getNext().getNext().getValue(), 3);
        Assertions.assertEquals(target.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getValue(), 2);
    }

    @Test
    public void testSmallCaseAddWithNode(){
        target = new LinkedListNode(1);
        target.add(new LinkedListNode(2));
        target.add(new LinkedListNode(3));
        Assertions.assertEquals(target.getValue(), 1);
        Assertions.assertEquals(target.getNext().getValue(), 2);
        Assertions.assertEquals(target.getNext().getNext().getValue(), 3);
    }
}
