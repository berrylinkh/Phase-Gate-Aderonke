




import java.util.Scanner;
public class TaskSix {
    public static void main (String [] args) {
    Scanner inputcollector = new Scanner (System.in);

    int sum =0;
    int average =0;
    int counter =0;
    
    System.out.print("Enter ten score: ");    
for (int count =1; count <=10; count++) {
    int scores = inputcollector.nextInt();
    if (scores % 2 ==0 ) {
    sum += scores;
    counter ++;
    }
}
          average = sum / counter;
        System.out.println ("The total average is: "+average);
    }   
}
