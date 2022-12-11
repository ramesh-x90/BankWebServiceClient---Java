package com.sltc;

public class OperationFactory {

    OperationFactory()
    {

    }

    public Operation getOperation( int selection)
    {
        Operation operation = null;
        int _selection = selection - 1;

        if(_selection == BankServiceActions.createAccount.ordinal() ){
            operation = new CreateAccount();
        }

        if(_selection == BankServiceActions.checkBalance.ordinal()){
            operation = new CheckBalance();
        }

        if(_selection == BankServiceActions.depositMoney.ordinal()){
            operation = new Deposit();
        }

        if(_selection == BankServiceActions.withdrawMoney.ordinal()){
            operation = new WithDraw();
        }

        if(_selection == BankServiceActions.transferMoney.ordinal()){
            operation = new Transfer();
        }

        return operation;
    }
}
