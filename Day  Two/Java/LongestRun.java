


public class LongestRun{
    public static void main (String [] args) {

    int[] number = {1,1,2,2,3,3,3,1,4,5};
    int newNumber = number[0];
    int digit =0;
    int counter =0;
    
    for (int count =0; count < number.length; count ++) {
     if (number[count] == newNumber) {
      digit +=number[count];
      counter ++;  
    }
    }
    System.out.print (digit);
    System.out.println (counter);
    }
}
    
