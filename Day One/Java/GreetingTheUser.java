

import java.util.Scanner;
    public class GreetingTheUser {
        public static void main (String [] args) {
        Scanner Scanned = new Scanner (System.in);

        System.out.print("Enter your name: ");
        String userName = Scanned.nextLine();


        System.out.println("Hello, " +userName);
        }
}

