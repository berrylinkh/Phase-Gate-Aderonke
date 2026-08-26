import java.util.Arrays;
public class ArrayTaskOne {

    public static int[] multiplyTheEvenAndAddTheOdd (int[] numbers) {
    int[]  arrayNumbers = new int [numbers.length];

    for(int count =0; count < numbers.length; count ++) {
        if (numbers[count] % 2 ==0) {
        arrayNumbers[count] = numbers[count] * 2;
        }
        else {
            if (numbers[count] % 2 !=0) {
            arrayNumbers[count] = numbers[count] + 1;       
            }
            }
    
    }
    return arrayNumbers;
    }
  

    public static boolean isCompleteSymbol (String forSymbol) {
    String isSymbol ="{}()[]<>";
    boolean isComplete = false;

    int openCurlyBracket =0;
    int closeCurlyBracket =0;

    int openCircleBracket =0;
    int closeCircleBracket =0;

    int openSquareBracket =0;
    int closeSquareBracket =0;

    int openAngleBracket =0;
    int closeAngleBracket =0;

    for(int picker =0; picker < isSymbol.length(); picker++) {
        if (isSymbol.charAt(picker) == '{') {
        openCurlyBracket ++;        
        } 
        else{
            if(isSymbol.charAt(picker) == '}') {
            closeCurlyBracket ++;           
            } 
        else {
            if(isSymbol.charAt(picker) == '(') {
            openCircleBracket ++;           
            } 
        else {
             if(isSymbol.charAt(picker) == ')') {
             closeCircleBracket ++;           
            } 
        else {
             if(isSymbol.charAt(picker) == '[') {
             openSquareBracket ++;           
            } 
        else {
             if(isSymbol.charAt(picker) == ']') {
             closeSquareBracket ++;           
            } 
        else {
             if(isSymbol.charAt(picker) == '<') {
             openAngleBracket ++;           
            } 
        else {
             if(isSymbol.charAt(picker) == '>') {
             closeAngleBracket ++;           
            } 
        }
        }
        }
        }
        } 
        }      
        } 
        if(openCurlyBracket == closeCurlyBracket && openCircleBracket == closeCircleBracket && openSquareBracket == closeSquareBracket && openAngleBracket == closeAngleBracket) {
        isComplete = true;
        }
        else {
            isComplete =false;
        }
    }
        return isComplete;
    }

    public static int[] sumTheNumberInTheArray (int[][] numbers) {
    int[]  arraySumOfNumber = new int [numbers.length];
    int sum =0;

    for(int count =0; count < numbers.length; count ++) {
        sum =0;
        int[]storex = numbers[count];

        for(int index =0; index < arraySumOfNumber.length; index ++) {
        sum += storex[count];
        arraySumOfNumber[index]=sum;
        } 
    }
    return  arraySumOfNumber;
    }
}
