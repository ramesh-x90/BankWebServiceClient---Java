package com.sltc;

import com.sltc.client.BankService;
import com.sltc.client.CantFindTheAccount_Exception;
import com.sltc.client.InvalidInputValues_Exception;

import java.util.Scanner;

public class CheckBalance extends BaseOperation{




    @Override
    public void invoke(Scanner scanner) {
        System.out.println();
        System.out.println("...[ Check Balance ]...");

        try {

        }catch (Exception e){

        }
        BankService bankService = this.serviceContainer.getBankService();

        this.getArgs(scanner);

        double balance = 0;
        try {
            balance = bankService.checkAccountBalance(args.remove(0), args.remove(0));
            System.out.println( String.format("Account balance: Rs.%.2f" , balance));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String[] getArgsTypes() {
        return new String[] {
                "Account id: ",
                "passcode: "
        };
    }
}
