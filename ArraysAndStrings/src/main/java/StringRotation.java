public class StringRotation {

    public boolean isRotation(String givenString, String rotatedString){
        if(givenString == null || rotatedString == null){
            return false;
        }
        if(givenString.length() != rotatedString.length()){
            return false;
        }
        String doubledGivenString = givenString + givenString;
        return doubledGivenString.contains(rotatedString);
    }
}

