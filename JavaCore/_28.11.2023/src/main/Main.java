package main;

import classes.ChildAccount;
import classes.CreditAccount;
import classes.DebitAccount;
import classes.Transaction;
import exception.IllegalArgumentException;
import exception.IncorrectTransactionException;
import exception.InsufficientFundsException;
import exception.ParentControlException;

public class Main {
    public static void main(String[] args) {
        try {
            ChildAccount childAccount1 = new ChildAccount(0, true, 500);
            childAccount1.depositIntoAccount(600);
//            childAccount1.withdrawalFromAccount(600); // Попытка снять больше установленного максимума

            ChildAccount childAccount2 = new ChildAccount(1000);
//            childAccount2.withdrawalFromAccount(1200); // Попытка снять больше, чем доступно на счету

//            DebitAccount debitAccount2 = new DebitAccount(-100); // Попытка создать счет с отрицательным балансом

            CreditAccount creditAccount1 = new CreditAccount();
            creditAccount1.withdrawalFromAccount(7000);

            CreditAccount creditAccount2 = new CreditAccount(100000);

            DebitAccount debitAccount1 = new DebitAccount(900);
            Transaction transaction = new Transaction();

            transaction.transaction(creditAccount2, debitAccount1, 110000);// Попытка снять больше,
            creditAccount2.showBalance();                                           // чем доступно на кредитном счету
            debitAccount1.showBalance();

        } catch (InsufficientFundsException | IncorrectTransactionException | IllegalArgumentException |
                 ParentControlException e) {
            System.err.printf("%s ", e.getMessage());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
