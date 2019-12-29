public class CheckPermutations {

    public boolean isPermutation(String givenString, String permutationString){
        if(givenString == null || permutationString == null){
            return false;
        }
        if (givenString.equals(permutationString)){
            return true;
        }
        if(givenString.length() != permutationString.length()){
            return false;
        }

        var hashGivenString = new int[256];

        for(int i = 0; i < givenString.length(); i++){
            hashGivenString[givenString.charAt(i)]++;
        }

        for(int i = 0; i < permutationString.length(); i++){
            hashGivenString[permutationString.charAt(i)]--;
        }

        for(int i = 0; i < 256; i++){
            if(hashGivenString[i] > 0){
                return false;
            }
        }
        return true;
    }
}
