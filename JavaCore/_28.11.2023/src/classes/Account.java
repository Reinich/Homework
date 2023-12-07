package classes;

import exception.IllegalArgumentException;
import exception.InsufficientFundsException;
import exception.ParentControlException;

public abstract class Account {
    private final int startBankAccount; // начальный баланс счета
    private int depositAmount; // сумма внесения наличных
    private int withdrawalAmount; // сумма снятие наличных

    /**
     * Открытие счета
     *
     * @param startBankAccount начальная сумма средств на счету
     * @throws IllegalArgumentException отрицальная сумма средств
     */
    public Account(int startBankAccount) throws IllegalArgumentException {
        if (startBankAccount < 0) {
            throw new IllegalArgumentException("Создание счета с отрицательным балансом: ", startBankAccount);
        }
        this.startBankAccount = startBankAccount;
    }

    /**
     * Внесение средств на счет
     *
     * @param depositAmount сумма внесения
     * @throws IllegalArgumentException сумма внесения отрицательная
     */
    public abstract void depositIntoAccount(int depositAmount) throws IllegalArgumentException;

    /**
     * Снятие средств со счета
     *
     * @param withdrawalAmount сумма снятия
     * @throws InsufficientFundsException сумма снятия превышает доступные средства
     */
    public abstract void withdrawalFromAccount(int withdrawalAmount) throws InsufficientFundsException, ParentControlException;

    public abstract void showBalance();

    // region Getters
    public int getStartBankAccount() {
        return startBankAccount;
    }

    public int getDepositAmountAccount() {
        return depositAmount;
    }


    public int getWithdrawalAmount() {
        return withdrawalAmount;
    }

    // endregion
}
