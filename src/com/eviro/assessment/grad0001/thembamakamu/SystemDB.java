package com.eviro.assessment.grad0001.thembamakamu;

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

        return data;

    }

}
