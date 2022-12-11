package com.sltc;

import com.sltc.client.BankService;

import java.util.Scanner;

public class Deposit extends BaseOperation{
    @Override
    public void invoke(Scanner scanner) {
        System.out.println();
        System.out.println("...[ Deposit Money ]...");
        BankService bankService = this.serviceContainer.getBankService();
        this.getArgs(scanner);

        try{
            double amount = bankService.depositMoney(this.args.remove(0) , this.args.remove(0) , Double.parseDouble(this.args.remove(0)));
            System.out.println(String.format("Rs. %.2f Successfully deposited...", amount) );

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String[] getArgsTypes() {
        return new String[]{
                "Account id: ",
                "Passcode: ",
                "Amount: "
        };
    }
}
