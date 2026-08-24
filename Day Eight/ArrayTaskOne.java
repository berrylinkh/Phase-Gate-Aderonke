
public class ArrayTaskOne {
    public static int[] increasingTheNumbersOfEachElement (int[]numbers) {
    int counter = 0;
    int numberInIndex =0;
    
    for (int count =0; count < numbers.length; count ++) {
        if (numbers[count] % 2 == 0){
           numberInIndex = numbers[count] * 2;
            counter ++;
        }
         else if (numbers[count] % 2 != 0){
                numberInIndex = numbers[count] + 1;
                counter ++;
                }
            
            }
             return numberInIndex;
      }
        
    }

   public static int sumTheNumberInTheArray (int[][] number,int index) {
    int[] arrayNumber =new int[3]; 
    int sum =0;

    for(int count= 0; count <number[index].length; count++) {
       sum = number[count][index]; 
       arrayNumber = sum;
    }
    return arrayNumber;
    
    }

    
}
