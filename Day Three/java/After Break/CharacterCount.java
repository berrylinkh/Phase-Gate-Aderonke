
public class CharacterCount  {
    public static void main (String [] args) {
    
    String character = "a111BAcb";

    int countTotal = countingSpecialCharacter (character);

        System.out.println("Special character count is: " +countTotal);
    }
    
    public static int countingSpecialCharacter (String word) {
    String inWord = word.toLowerCase();
    String allCharacters = "abcdefghijklmnopqrstuvwxyz0123456789";

   
    int totalCounter =0;


    for (int count = 0; count < allCharacters.length(); count ++) {
        char characterCheck = allCharacters.charAt(count);
        int appearance =0;
        
        for (int index = 0; index < inWord.length(); index ++) {    
        if(characterCheck  ==inWord.charAt(index)) {
        appearance++;
            }
        }
    if (appearance > 1) {
    totalCounter ++;    
        }
    }

    return totalCounter;
    }
}
