

public class ArrayOfNumbers{
    public static boolean isTrueForNumber (int[] numbers) {
    boolean isRepetitive =false;
    int counter = 0;
    
    for(int count = 0; count <numbers.length; count ++) {
            int numberholder = numbers[count];
            for (int index =0; index <numbers.length; index ++) {
            if (numbers[index] == numbers[count]) {
            counter ++;
            }
            }
            }
    if(counter >1) {
     return true; 
    }
    else {
    return false;
        }
    
    
    }

    public static int[] findingTheIntersectionNumber (int[] firstArray, int[]secondArray) {
    int[] number = new int[secondArray.length];
    
    for(int count = 0; count <firstArray.length; count ++) {
            for (int index =0; index <secondArray.length; index ++) {
            if (secondArray[index] == firstArray[count]) {
            number[index] = secondArray[index];
            }
            }
        }
        return number;
    
    }

    public static int[] addingOneToTheLastNumber (int[] arrayNumbers) {
    int[] number = new int[arrayNumbers.length];
    
    for(int count = 0; count <arrayNumbers.length; count ++) {
        int[] storex = arrayNumbers;
        if(count ==2){
        storex[count] = arrayNumbers[count] + 1;
        }
        for(int index =0; index <arrayNumbers.length; index++) {
        number[index] = storex[count]; 
        }
    }
    return number;
    
    }
}
        
