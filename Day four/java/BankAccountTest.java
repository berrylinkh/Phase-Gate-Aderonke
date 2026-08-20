



import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.*;
        public class BankAccountTest {

        @Test
        public void transactionDeposit (){

        double accountBalance = 0;
        double expectedDeposit = BankAccount.gettingTransactionDeposit(accountBalance);
        double actualDeposit = 10000;

        assertEquals(actualDeposit,expectedDeposit);
        } 
    
        @Test
        public void TransactionLogApplicationTest (){

        double currentBalance = 10000;
        double expectedAmountAfterWithdrawal = BankAccount.gettingTheCurrentBalanceAfterWithdrawal(currentBalance);
        double actualAmountAfterWithdrawal = 5000;

        assertEquals(actualAmountAfterWithdrawal,expectedAmountAfterWithdrawal);
        } 

    }
