package com.sltc;

import com.sltc.client.BankService;
import com.sltc.client.CantFindTheAccount_Exception;
import com.sltc.client.InsufficientBalance_Exception;
import com.sltc.client.InvalidInputValues_Exception;

import java.util.Scanner;

public class Transfer extends BaseOperation{
    @Override
    public void invoke(Scanner scanner) {
        System.out.println();
        System.out.println("...[ Transfer money ]...");

        this.getArgs(scanner);

        BankService bankService = this.serviceContainer.getBankService();
        try {
            double amount = bankService.transferMoney(this.getNextArg(),this.getNextArg(),this.getNextArg(),Double.parseDouble(this.getNextArg()));
            System.out.println(String.format("Transfer successful.... Rs.%.2f " , amount ));
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
        return new String[]{
                "Account id: ",
                "Transfer to Account id: ",
                "passcode: ",
                "Transfer amount: "
        };
    }
}
