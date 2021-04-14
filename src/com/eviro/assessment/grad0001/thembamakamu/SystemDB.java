package com.eviro.assessment.grad0001.thembamakamu;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SystemDB{

    private static SystemDB mInstance;
    private static ArrayList<CurrentAccount> data;

    private SystemDB(){

    }

    public static SystemDB getInstance(){

        if (SystemDB.mInstance == null){

            SystemDB.mInstance = new SystemDB();

        }

        return SystemDB.mInstance;

    }

    public static ArrayList<CurrentAccount> dummyData(){

       SystemDB.data = new ArrayList<>();

       SystemDB.data.add(new CurrentAccount(103,"3",new BigDecimal(1000),
               new BigDecimal(10000)));
        SystemDB.data.add(new CurrentAccount(104,"4",new BigDecimal(-5000),
                new BigDecimal(20000)));

        return data;

    }

}
