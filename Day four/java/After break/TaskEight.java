






import java.util.Scanner;
public class TaskEight {
    public static void main (String [] args) {
    Scanner inputcollector = new Scanner (System.in);

    int sum =0;
    int counter =0;
    
    System.out.print("Enter ten score: ");    
for (int count =1; count <=10; count++) {
    int scores = inputcollector.nextInt();
    if (scores <0 ) {
    System.out.println ("Invalid score");
    }
    else {
        sum += scores;
    }
}
        System.out.println ("The total sum is: "+sum);
    }   
}
