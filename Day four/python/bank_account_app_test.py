
from unittest import TestCase

from bank_account_app_test import getting_transaction_deposit

def transaction_deposit (self):
    double accountBalance = 0;
    double expectedDeposit = BankAccount.gettingTransactionDeposit(accountBalance);
    double actualDeposit = 10000;

    self.assertEqual(actualDeposit,expectedDeposit);
    
