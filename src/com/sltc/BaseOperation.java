package com.sltc;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class BaseOperation implements Operation{
    protected ArrayList<String> args;
    protected ServiceContainer serviceContainer = ServiceContainer.getInstance();

    protected String[] argsTypes;



    BaseOperation(){
        args = new ArrayList<>();
        argsTypes = getArgsTypes();

    }

    @Override
    public void getArgs(Scanner scanner) {
        for (String arg: argsTypes) {
            System.out.print(arg);
            this.args.add(scanner.nextLine().trim());
        }
    }

    public String getNextArg(){
        return args.remove(0);
    }
}
