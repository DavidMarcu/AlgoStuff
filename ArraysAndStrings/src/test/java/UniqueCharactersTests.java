import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UniqueCharactersTests {

    private UniqueCharacters target;

    @BeforeEach
    public void setup(){
        target = new UniqueCharacters();
    }

    @DisplayName("if all characters are diffent then it should return true")
    @Test
    public void testHappyCase(){
        var allCharactersUnique = target.allUniqueCharacters("a$%bcdef");
        Assertions.assertTrue(allCharactersUnique);
    }

    @DisplayName("if string is null then it should return false")
    @Test
    public void testNullCase(){
        var allCharactersUnique = target.allUniqueCharacters(null);
        Assertions.assertFalse(allCharactersUnique);
    }

    @DisplayName("if string is empty then it should return false")
    @Test
    public void testEmptyCase(){
        var allCharactersUnique = target.allUniqueCharacters("");
        Assertions.assertFalse(allCharactersUnique);
    }

    @DisplayName("if string doesn't contain unique characters it should return false")
    @Test
    public void testWithNotUniqueCharacters(){
        var allCharactersUnique = target.allUniqueCharacters("jk**(1ii)2");
        Assertions.assertFalse(allCharactersUnique);
    }
}
