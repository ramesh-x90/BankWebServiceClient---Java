package com.sltc;

import com.sltc.client.BankService;
import com.sltc.client.CantFindTheAccount_Exception;
import com.sltc.client.InsufficientBalance_Exception;
import com.sltc.client.InvalidInputValues_Exception;

import java.util.Scanner;

public class WithDraw extends BaseOperation{
    @Override
    public void invoke(Scanner scanner) {
        System.out.println();
        System.out.println("...[ Withdraw money ]...");


        BankService bankService = this.serviceContainer.getBankService();
        this.getArgs(scanner);

        double withDrawAmount = 0;
        try {
            withDrawAmount = bankService.withdrawMoney( this.getNextArg() , this.getNextArg() ,Double.parseDouble(this.getNextArg()));
            System.out.println(String.format("you have withdrawn Rs. %.2f" , withDrawAmount));

        } catch (CantFindTheAccount_Exception e) {
            System.out.println(e.getMessage());

        } catch (InsufficientBalance_Exception e) {
            System.out.println(e.getMessage());

        } catch (InvalidInputValues_Exception e) {
            System.out.println(e.getMessage());

        }


    }

    @Override
    public String[] getArgsTypes() {
        return new String[] {
                "Account Id: ",
                "Passcode: ",
                "withdraw amount: "
        };
    }
}
