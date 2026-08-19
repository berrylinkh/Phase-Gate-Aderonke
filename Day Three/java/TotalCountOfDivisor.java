






public class TotalCountOfDivisor{
    public static void main (String [] args) {
    
    int number = 20;
    int divisor=0;
    

    for(int count =1; count <=20 ; count ++) {
        if(number % count ==0) {
        divisor ++;
        }
  
        }
        System.out.println (divisor); 
    }
}

