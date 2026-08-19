



public class AverageOfHundred {
    public static void main (String [] args) {

    int sum =0;
    int average =0;

    for(int count = 1; count <= 100 ; count ++) {
        sum = sum + count;
        average = sum / 100;
        
        }
        System.out.println ("The average is: "+average); 
    }
}

