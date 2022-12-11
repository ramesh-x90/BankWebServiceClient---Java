package com.sltc;

import com.sltc.client.Account;
import com.sltc.client.BankService;
import com.sltc.client.CreateAccountRes;
import java.util.Scanner;

public class CreateAccount extends BaseOperation{


    @Override
    public void invoke(Scanner scanner) {
        BankService bankService = this.serviceContainer.getBankService();
        try {
            System.out.println();
            System.out.println("[ ...Account creation...]");

            this.getArgs(scanner);


            CreateAccountRes res = bankService.createAccount(
                    this.args.remove(0),
                    this.args.remove(0),
                    this.args.remove(0),
                    this.args.remove(0),
                    this.args.remove(0));

            if(res == null){
                System.out.println("Account creation failed");
                return;
            }

            Account acc = (Account)res.getAcc();
            System.out.println("\nyour account has been created");
            System.out.println(String.format("Account id: %s" , acc.getId()));
            System.out.println(String.format("Account owner's name : %s %s" , acc.getFirstName() , acc.getLastName()));
            System.out.println(String.format("Account owner's phone number : %s" , acc.getPhoneNo()) );
            System.out.println(String.format("Account owner's address : %s" , acc.getAddress()));
            System.out.println(String.format("Account owner's NIC number : %s" , acc.getNIC()));
            System.out.println(String.format("Account pass code: %s" , res.getPassCode()));
            System.out.println("Don't forget your pass code. good luck.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String[] getArgsTypes() {
        return new String[] {
                "first name:",
                "last name:",
                "phone number:",
                "address:",
                "NIC number:"
        };
    }
}
