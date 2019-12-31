import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringRotationTests {

    private StringRotation target;

    @BeforeEach
    public void setup(){
        target = new StringRotation();
    }

    @Test
    public void testHappyCase(){
        Assertions.assertTrue(target.isRotation("erbottlewat", "waterbottle"));
    }

    @Test
    public void testNullCase(){
        Assertions.assertFalse(target.isRotation(null, null));
    }

    @Test
    public void testFalseCase(){
        Assertions.assertFalse(target.isRotation("harrypotato", "potatoarry"));
    }
}
