package com.eviro.assessment.grad0001.thembamakamu;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        SystemDB.dummyData();

        CurrentAccount currentAccount = new CurrentAccount();

        currentAccount.withdraw("6",new BigDecimal(1000));

    }

}
