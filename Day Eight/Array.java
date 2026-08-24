


public class Array {
   public static void main (String [] args) {
    int[] numbers = {2,8,14,5,1};
    int counter = 0;
    int add =0;
    
    for (int count =0; count < numbers.length; count ++) {
        if (numbers[count] % 2 == 0){
           add = numbers[count] * 2;
            counter ++;
            }
        else if (numbers[count] % 2 != 0){
                add = numbers[count] + 1;
                counter ++;
                }
             System.out.print (add + " ");
            
            }
            System.out.println();

    int[][] multipleNumbers = {{3,5,7}, {2,2,2}, {4,1,9}};


    int sum = multipleNumbers[0][0]+ multipleNumbers[0][1] + multipleNumbers[0][2];
    int sumone = multipleNumbers[1][0]+ multipleNumbers[1][1] + multipleNumbers[1][2];
    int sumtwo = multipleNumbers[2][0]+ multipleNumbers[2][1] + multipleNumbers[2][2];

        System.out.printf ("%d,%d,%d%n",sum, sumone,sumtwo);
    }
} 
