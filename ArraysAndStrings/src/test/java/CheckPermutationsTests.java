import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckPermutationsTests {

    private CheckPermutations target;

    @BeforeEach
    public void setup(){
        target = new CheckPermutations();
    }

    @DisplayName("if strings are permutations than it should return true")
    @Test
    public void testHappyCase(){
        var isPermutation = target.isPermutation("a$%bcdef", "$abcdef%");
        Assertions.assertTrue(isPermutation);
    }

    @DisplayName("if one string is null then it should return false")
    @Test
    public void testNullCase(){
        var isPermutation = target.isPermutation(null, "none");
        Assertions.assertFalse(isPermutation);
    }

    @DisplayName("if strings are equal then it should return true")
    @Test
    public void testEqualCase(){
        var isPermutation = target.isPermutation("abab", "abab");
        Assertions.assertTrue(isPermutation);
    }

    @DisplayName("if strings are of different lenghts it should return false")
    @Test
    public void testDifferentLengthCase(){
        var isPermutation = target.isPermutation("jk**(1ii)2", "5char");
        Assertions.assertFalse(isPermutation);
    }

    @DisplayName("if strings are permutations of one another and they contain more than one same character but it should return true")
    @Test
    public void testMoreGeneralPermuttaionCase(){
        var isPermutation = target.isPermutation("jk**(1ii)2", "i()j12**ki");
        Assertions.assertTrue(isPermutation);
    }

    @DisplayName("if strings are not permutations and contain more than one same character it should return true")
    @Test
    public void testMoreGeneralNotPermutationCase(){
        var isPermutation = target.isPermutation("jk**(1ii)2", "i()j12i*ki");
        Assertions.assertFalse(isPermutation);
    }
}
