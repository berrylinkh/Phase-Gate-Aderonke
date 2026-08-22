






public class TaskOne{
    public static void main (String [] args) {

    int[] theprimeNumber ={5,9,3,6,2}; 
    
    int counter =0;

        for (int count =0; count < theprimeNumber.length; count ++) {
        int numberIncount = theprimeNumber[count];
 
        counter =0;
        for (int checker =1; checker <= numberIncount; checker ++) {
            if ( numberIncount % checker == 0) {
                counter ++;
                }
            }
                if (counter == 2) {
                 System.out.print(numberIncount + " ");
                
                }
            }
                 System.out.println();
    }
}
