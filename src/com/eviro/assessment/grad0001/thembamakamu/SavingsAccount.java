package com.eviro.assessment.grad0001.thembamakamu;

import java.math.BigDecimal;

public class SavingsAccount {

    private int id;
    private String accountNum;
    private BigDecimal balance;

    public SavingsAccount(int id, String accountNum, BigDecimal balance) {
        this.id = id;
        this.accountNum = accountNum;
        this.balance = balance;
    }
}
