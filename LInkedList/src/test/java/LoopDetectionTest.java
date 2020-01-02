import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoopDetectionTest {

    private LoopDetection target;

    @BeforeEach
    public void setup(){
        target = new LoopDetection();
    }

    @Test
    public void testLoopHappyCase(){
        var head = new LinkedListNode(1);
        head.add(new LinkedListNode(2));
        var loopNode = new LinkedListNode(3);
        head.add(loopNode);
        head.add(new LinkedListNode(4));
        head.add(new LinkedListNode(5));
        head.add(loopNode);
        Assertions.assertTrue(target.isLoop(head));
        Assertions.assertEquals(loopNode, target.getInitialLoopNode(head));
    }

    @Test
    public void testLoopTrickyCase(){
        var head = new LinkedListNode(1);
        head.add(new LinkedListNode(2));
        var loopNode = new LinkedListNode(3);
        head.add(loopNode);
        head.add(new LinkedListNode(3));
        head.add(new LinkedListNode(3));
        head.add(new LinkedListNode(4));
        head.add(new LinkedListNode(5));
        head.add(loopNode);
        Assertions.assertTrue(target.isLoop(head));
        Assertions.assertEquals(loopNode, target.getInitialLoopNode(head));
    }

    @Test
    public void testNoLoop(){
        var head = new LinkedListNode(1);
        head.add(new LinkedListNode(2));
        var loopNode = new LinkedListNode(3);
        head.add(loopNode);
        head.add(new LinkedListNode(3));
        head.add(new LinkedListNode(3));
        head.add(new LinkedListNode(4));
        head.add(new LinkedListNode(5));
        Assertions.assertFalse(target.isLoop(head));
    }
}
