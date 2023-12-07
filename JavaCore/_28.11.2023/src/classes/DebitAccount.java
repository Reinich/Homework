package classes;

import exception.IllegalArgumentException;
import exception.InsufficientFundsException;
import exception.ParentControlException;

public class DebitAccount extends Account{
    private int startBankAccount; // начальный баланс счета
    private int depositAmount; // сумма внесения наличных
    private int withdrawalAmount; // сумма снятие наличных

    /**
     * Открытие счета
     *
     * @param startBankAccount начальная сумма средств на счету
     * @throws IllegalArgumentException отрицальная сумма средств
     */
    public DebitAccount(int startBankAccount) throws IllegalArgumentException {
        super(startBankAccount);
        this.startBankAccount = startBankAccount;
    }

    /**
     * Внесение средств на дебитовый счет
     * @param depositAmount сумма внесения
     * @throws IllegalArgumentException отрицательная сумма внесения
     */
    @Override
    public void depositIntoAccount(int depositAmount) throws IllegalArgumentException {
        if (depositAmount < 0) {
            throw new IllegalArgumentException("Попытка внести депозит с отрицательной суммой: ", depositAmount);
        }
        this.startBankAccount += depositAmount;
    }

    /**
     * Снятие средств с дебитового счета
     * @param withdrawalAmount сумма снятия
     * @throws InsufficientFundsException отрицательный счет на счету
     * @throws ParentControlException родительский контроль
     */
    @Override
    public void withdrawalFromAccount(int withdrawalAmount) throws InsufficientFundsException, ParentControlException {
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
