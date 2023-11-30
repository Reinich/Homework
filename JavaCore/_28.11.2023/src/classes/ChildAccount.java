package classes;

import exception.IllegalArgumentException;
import exception.InsufficientFundsException;
import exception.ParentControlException;

public class ChildAccount extends Account {
    private int startBankAccount; // начальный баланс счета
    private int depositAmount; // сумма внесения наличных
    private int withdrawalAmount; // сумма снятие наличных
    private boolean parentControl; // родительский контроль
    private int maxMoneyControl; // максимальный лимит снятия

    /**
     * Создание детского счета без родительского контроля
     * @param startBankAccount начальная сумма на счету
     * @throws IllegalArgumentException отрицательный баланс
     */
    public ChildAccount(int startBankAccount) throws IllegalArgumentException {
        super(startBankAccount);
        this.startBankAccount = startBankAccount;
    }

    /**
     * Создание детского счета с родительским контролем
     *
     * @param startBankAccount начальная сумма на счету
     * @param parentControl    родительский контроль
     * @param maxMoneyControl  максимальное снятие средств со счета
     * @throws IllegalArgumentException отрицательный баланс
     */
    public ChildAccount(int startBankAccount, boolean parentControl, int maxMoneyControl) throws IllegalArgumentException {
        super(startBankAccount);
        this.startBankAccount = startBankAccount;
        this.parentControl = parentControl;
        if (parentControl) {
            this.maxMoneyControl = maxMoneyControl;
        }
    }

    /**
     * Внесение средств на счет
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
     * Снятие средств со счета
     *
     * @param withdrawalAmount сумма снятия средств
     * @throws InsufficientFundsException сумма снятия превышает доступные средства
     */
    @Override
    public void withdrawalFromAccount(int withdrawalAmount) throws InsufficientFundsException, ParentControlException {
        if (this.startBankAccount < withdrawalAmount) {
            throw new InsufficientFundsException("Недостаточно средств: ", this.startBankAccount);
        }
        if (parentControl) {
            if (withdrawalAmount > maxMoneyControl) {
                throw new ParentControlException("Превышен разрешенный лимит: ", maxMoneyControl);
            } else {
                this.startBankAccount -= withdrawalAmount;
            }
        } else {
            startBankAccount -= withdrawalAmount;
        }
    }

    @Override
    public void showBalance() {
        System.out.println(getStartBankAccount());
    }


    // region Getters
    @Override
    public int getStartBankAccount() {
        return startBankAccount;
    }
    // endregion
}
