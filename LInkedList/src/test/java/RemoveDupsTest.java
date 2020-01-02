import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveDupsTest {

    private RemoveDups target;

    @BeforeEach
    public void setup(){
        target = new RemoveDups();
    }

    @Test
    public void testHappyCase(){
        var targetList = new LinkedListNode(1);
        targetList.add(2);
        targetList.add(3);
        targetList.add(1);
        targetList.add(2);
        targetList.add(3);
        targetList.add(1);
        targetList.add(2);
        targetList.add(3);
        LinkedListNode listNoDups = target.getLinkedListWithoutDups(targetList);
        Assertions.assertEquals(listNoDups.getValue(), 1);
        Assertions.assertEquals(listNoDups.getNext().getValue(), 2);
        Assertions.assertEquals(listNoDups.getNext().getNext().getValue(), 3);
        Assertions.assertNull(listNoDups.getNext().getNext().getNext());
    }
}
