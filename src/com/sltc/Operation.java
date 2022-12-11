package com.sltc;


import java.util.Scanner;

public interface   Operation {

    void invoke(Scanner scanner);

    String[] getArgsTypes();

    void getArgs(Scanner scanner);
}
