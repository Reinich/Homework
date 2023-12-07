package classes;

import exception.IllegalArgumentException;
import exception.InsufficientFundsException;

public class CreditAccount extends Account {
    private int startBankAccount; // начальный баланс счета
    private int withdrawalAmount; // сумма снятие наличных

    /**
     * Создание договорного кредитного счета
     * @param startBankAccount договорная сумма на кредитной карте
     * @throws IllegalArgumentException отрицательная начальная сумма
     */
    public CreditAccount(int startBankAccount) throws IllegalArgumentException {
        super(startBankAccount);
        this.startBankAccount = startBankAccount;
    }

    /**
     * Создание стандартного кредитного счета
     * @throws IllegalArgumentException отрицательная начальная сумма
     */
    public CreditAccount() throws IllegalArgumentException{
        super(5000);
        this.startBankAccount = 50000;
    }

    @Override
    public void depositIntoAccount(int depositAmount) throws IllegalArgumentException {
        if (depositAmount < 0) {
            throw new IllegalArgumentException("Попытка внести депозит с отрицательной суммой: ", depositAmount);
        }
        this.startBankAccount += depositAmount;
    }

    /**
     * Внесение средств
     * @param withdrawalAmount сумма снятия
     * @throws InsufficientFundsException отрицательный баланс
     */
    @Override
    public void withdrawalFromAccount(int withdrawalAmount) throws InsufficientFundsException {
        if (this.startBankAccount < withdrawalAmount) {
            throw new InsufficientFundsException("Недостаточно средств: ", this.startBankAccount);
        }
        this.startBankAccount -= withdrawalAmount;
    }

    @Override
    public void showBalance() {System.out.println(getStartBankAccount());}

    // region Getters
    @Override
    public int getStartBankAccount() {
        return startBankAccount;
    }
    // endregion
}
