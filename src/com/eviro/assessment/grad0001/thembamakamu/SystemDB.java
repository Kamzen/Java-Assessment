package com.eviro.assessment.grad0001.thembamakamu;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SystemDB{

    private static SystemDB mInstance;
    private ArrayList<CurrentAccount> data;
    private ArrayList<SavingsAccount> savingsAccounts;

    private SystemDB(){

    }

    public static SystemDB getInstance(){

        if (SystemDB.mInstance == null){

            SystemDB.mInstance = new SystemDB();

        }

        return SystemDB.mInstance;

    }

    public ArrayList<CurrentAccount> currentAccountData(){

       this.data = new ArrayList<>();

       this.data.add(new CurrentAccount(103,"3",new BigDecimal(1000),
               new BigDecimal(10000)));
        this.data.add(new CurrentAccount(104,"4",new BigDecimal(-5000),
                new BigDecimal(20000)));

        return this.data;

    }

    public ArrayList<SavingsAccount> savingsAccountData(){

        this.savingsAccounts = new ArrayList<>();

        this.savingsAccounts.add(new SavingsAccount(101,"1",new BigDecimal(2000)));
        this.savingsAccounts.add(new SavingsAccount(102,"2",new BigDecimal(5000)));

        return this.savingsAccounts;

    }

}
