
import java.util.Scanner;
    public class BankAccount {
        public static void main (String [] args) {
        Scanner inputCollector = new Scanner (System.in);
         
        String transactionMenu = """
            1. Deposit
            2. Withdrawal
            3. show transaction history
            0. Exit the program

            select any option:

            """;
        System.out.println(transactionMenu);

        System.out.print("Select transaction option: ");
        int transactionMeunOPtion = inputCollector.nextInt();


        switch (transactionMeunOPtion) {

            case 1:

                    System.out.print("Enter amount: ");
                    double inputAmount = inputCollector.nextDouble();
                    double depositResult = gettingTransactionDeposit (inputAmount);
                    System.out.println("Deposit successful. current balance: "+ depositResult); break;
                
                
            case 2:

                    System.out.print("Enter amount: ");
                    double inputWithdrawal = inputCollector.nextDouble();
                    double withdrawalResult = gettingTheCurrentBalanceAfterWithdrawal (inputWithdrawal);
                    if (inputWithdrawal  > withdrawalResult ) {
                    System.out.println("insufficient fund. current balance is: "+ withdrawalResult); break;
                    }
                    else {
                    System.out.println("withdrawal successful. current balance is: "+ withdrawalResult); break;
                    }

            case 3: System.out.println("show transaction history"); break;
            case 0: double  newBalance = 0;
                    double exitDisplay = gettingTheCurrentBalanceAfterWithdrawal ( newBalance);                
                    System.out.println("Final balance is: "+ exitDisplay);
                    System.out.println("Thank you for using Transaction log App"); break;


            default :System.out.println("invalid input"); break;
       }     
      
     
    }
        public static double gettingTransactionDeposit (double amount) {
        
        double depositAmount = amount;
        double currentBalance = 0;
        double deposit = currentBalance + depositAmount;
        double newDeposit = deposit;
        return newDeposit;
        }
        
        public static double gettingTheCurrentBalanceAfterWithdrawal ( double amount) {
        
        double currentAccountBalance = 10000;
        double withdrawalAmount = amount;
        double withdrawalBalance = currentAccountBalance - withdrawalAmount;
        double newBalance = withdrawalBalance;

        if (withdrawalAmount > currentAccountBalance ) {
        return currentAccountBalance;
        }
        else {
        return newBalance;
        }

        }
        
        
 
}
