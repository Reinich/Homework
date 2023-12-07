package classes;

import exception.IllegalArgumentException;
import exception.IncorrectTransactionException;
import exception.InsufficientFundsException;
import exception.ParentControlException;

public class Transaction {
    Account debitAccount;
    Account creditAccount;
    int startBankAccount;

    public Transaction() {

    }

    public void transaction(Account creditAccount, Account debitAccount, int depositAmount) throws IncorrectTransactionException, ParentControlException, InsufficientFundsException, IllegalArgumentException {
        if (creditAccount.getStartBankAccount() < depositAmount) {
            throw new IncorrectTransactionException("Недостаточно средств на кредитке", creditAccount.getStartBankAccount());
        }
        creditAccount.withdrawalFromAccount(depositAmount);
        debitAccount.depositIntoAccount(depositAmount);
    }

}
