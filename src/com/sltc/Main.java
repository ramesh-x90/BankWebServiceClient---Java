package com.sltc;



import java.util.Scanner;

public class Main {

    static String[] optionsList ;

    static {
        optionsList = new String[]{
                "Create Account",
                "check balance",
                "deposit money",
                "withdraw money",
                "transfer money",
                "Exit"
        };
    }

    public static void main(String[] args)
    {
        Main application = new Main();

        OperationFactory factory = new OperationFactory();
        Scanner scanner = new Scanner(System.in);


        int a = 0;

        while( true ){

            application.clearCli();
            application.options();
            String inputString = scanner.nextLine().trim();

            try{
                while(inputString.isEmpty()){
                    inputString = scanner.nextLine().trim();
                }
                a = Integer.parseInt(inputString);



                if(a == optionsList.length) break;


                Operation operation = factory.getOperation(a);
                if(operation != null) operation.invoke(scanner);

            }catch(Exception e){
                continue;
            }

            System.out.println();


        }

        scanner.close();

        System.out.println("Good bye....");





    }

    public void options()
    {

        for (int i = 0; i < optionsList.length; i++) {
            System.out.println(String.format("[%d] %s" , i+1 , optionsList[i]));
        }
        System.out.println();
        System.out.print("Select a option: ");
    }


    public void clearCli(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                Runtime.getRuntime().exec("cls");
            else
                Runtime.getRuntime().exec("clear");
        } catch (Exception x) {}
    }
}
