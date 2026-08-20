


import java.util.Scanner;
    public class TaskTwo {
        public static void main (String [] args) {
        Scanner inputcollector = new Scanner (System.in);

    int sum =0;
    int average =0;
    
    System.out.print("Enter ten score: ");    
for (int count =1; count <=10; count++) {
    int scores = inputcollector.nextInt();
    sum += scores;
    }
        average = sum / 10;
        System.out.println ("The total average is: "+average);
    }   
}
