



public class TaskFour{
    public static void main (String [] args) {

    int[] theOccuringNumber ={45,60,3,0,67,2,45,3,22,0}; 
    
    int counter =0;

        for (int count =0; count < theOccuringNumber.length; count ++) {
        int numberIncount = theOccuringNumber[count];
 
        counter =0;
        for (int checker =0; checker < theOccuringNumber.length; checker ++) {
            if ( numberIncount == theOccuringNumber[checker]) {
                counter ++;
                }
            }
                if (counter > 1) {
                 System.out.print(numberIncount + " ");
                
                }
            }
                 System.out.println();
    }
}
