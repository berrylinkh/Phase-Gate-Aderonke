


public class LongestRun{
    public static void main (String [] args) {

    int[] number = {1,1,2,2,3,3,3,1,4,5};
    int newNumber = number[4];
    int digit =0;
    int counter =0;
    
    for (int count =0; count < number.length; count ++) {
     if (number[count] == newNumber) {
        digit = number[count];
      System.out.print (digit + "");
      counter ++;  
    }
    }
    System.out.println();
    System.out.println (counter);
    }
}
    
