
public class CharacterCount  {
    public static void main (String [] args) {
    
    String character = "a111BAcb";

    int countTotal = countingSpecialCharacter (character);

        System.out.println("Special character count is: " +countTotal);
    }
    
    public static int countingSpecialCharacter (String word) {
    String inWord = " ";
    String upperAlphabet = "ABCDEFGHIJKLMNOPQURSTUVWXYZ";
    String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
    String number = "0123456789";
    int counter =0;
    int totalCounter =0;


    for (int count = 0; count < inWord.length(); count ++) {
        for(int index = 0; index < upperAlphabet.length; index ++) {
            for (int index2 = 0; index2 < lowerAlphabet.length; index2 ++) {
            for (int index3 =0; index3 <number.length; index3 ++ ) {
            if(inword (count) == upperAlphabet(index)) {
            counter ++;
            }
            if (inword (count) == lowerAlphabet(index2)) {
            counter ++;
            }
            if (inword (count) == number(index3)) {
            counter ++;
            }
            }
            }
        }
        totalCounter = counter;
    }

    return totalCounter;
    }
}
