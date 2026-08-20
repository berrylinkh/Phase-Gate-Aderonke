








import java.util.Scanner;
public class TaskNine {
    public static void main (String [] args) {
    Scanner inputcollector = new Scanner (System.in);

    int sum =0;
   
    
    System.out.print("Enter ten score: ");    
for (int count =1; count <=10; count++) {
    int scores = inputcollector.nextInt();
    if (scores >=0 && scores <=100 ) {
       sum += scores;
    }
  
}
        System.out.println ("The total sum is: "+sum);
    }   
}
