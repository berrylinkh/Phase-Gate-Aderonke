



import java.util.Scanner;
    public class MyNameAndDate {
        public static void main (String [] args) {
        Scanner Scanned = new Scanner (System.in);

        System.out.print("Enter your name: ");
        String userName = Scanned.nextLine();
        int date = 17;
        String month ="08";
        int year = 2026;


        System.out.println("\"My name is \"" + userName + "\"\"" );
        System.out.printf("\"Today is %d/%s/%d\"%n ", date,month,year);
        }
}

