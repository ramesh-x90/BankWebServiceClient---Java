package com.sltc;


import com.sltc.client.BankService;
import com.sltc.client.BankService_Service;

public class ServiceContainer {


    private static ServiceContainer instance;
    private BankService_Service serviceClient ;
    private BankService bankService;

    static {
        instance = new ServiceContainer();
    }

    private ServiceContainer(){
        serviceClient = new BankService_Service();
        bankService = serviceClient.getBankServicePort();
    }


    public static ServiceContainer getInstance(){
        return instance;
    }

    public BankService_Service getServiceClient()
    {
        return serviceClient;
    }

    public BankService getBankService() {
        return bankService;
    }

}
