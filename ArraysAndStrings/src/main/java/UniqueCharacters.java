import java.util.HashMap;

public class UniqueCharacters{

    /*
        if the string constraint are small you could try a bit vector
        e.g:
        int val = str.charAt(i) - 'a';
        if «checker & (1 « val» > a) {
            return false;
        }
        checker |= (1 « val);

     */
    boolean allUniqueCharacters(String string){
        if(string == null || "".equals(string)){
            return false;
        }
        var characters = new HashMap<Character, Integer>();
        for(char character: string.toCharArray()){
            Integer occurences = characters.getOrDefault(character, 0);
            if(occurences >= 1){
                return false;
            }
            characters.put(character, occurences + 1);
        }
        return true;
    }

    //if no other data structure is allowed then you can sort the given string, you will obtain O(n*log n)

}