import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MinHeapTests {

    private MinHeap target;

    @BeforeEach
    public void setup(){
        target = new MinHeap();
    }

    @Test
    public void testSimpleCaseInsert(){
        target.insert(55);
        target.insert(50);
        target.insert(90);
        target.insert(87);
        target.insert(4);
        List<Integer> finalHeap = target.insert(7);
        List<Integer> testList = List.of(4, 50, 7, 87, 55, 90);
        Assertions.assertEquals(finalHeap.get(0), 4);
        Assertions.assertEquals(finalHeap, testList);
    }

    @Test
    public void testSimpleCaseExtractMin(){
        target.insert(55);
        target.insert(50);
        target.insert(90);
        target.insert(87);
        target.insert(4);
        target.insert(7);
        int min = target.extractMin();
        List<Integer> testList = List.of(7, 50, 90, 87, 55);
        Assertions.assertEquals(min, 4);
        Assertions.assertEquals(target.copyOf(), testList);
    }
}
