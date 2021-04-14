package com.eviro.assessment.grad0001.thembamakamu;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class CurrentAccount implements AccountService {

    private int id;
    private String accountNum;
    private BigDecimal balance,overdraft;
    private Object AccountNotFoundException;

    public CurrentAccount(int id, String accountNum, BigDecimal balance, BigDecimal overdraft) {
        this.id = id;
        this.accountNum = accountNum;
        this.balance = balance;
        this.overdraft = overdraft;
    }
    public CurrentAccount(){};

    public int getId() {
        return id;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getOverdraft() {
        return overdraft;
    }

    @Override
    public void withdraw(String accountNum, BigDecimal amountToWithdraw) {

        ArrayList<CurrentAccount> accounts = SystemDB.dummyData();



        try {

            boolean accFound = false;
            int accIndex = -1;

            for (int i = 0; i < accounts.size(); i++){

                if (accounts.get(i).getAccountNum().equals(accountNum)){

                    accFound = true;
                    accIndex = i;
                    break;

                }
                if (i == accounts.size() - 1 && !accFound){

                    throw (Throwable) AccountNotFoundException;

                }

            }

            if (accFound){

                CurrentAccount currentAccount = accounts.get(accIndex);

                BigDecimal overdraftLimit = new BigDecimal(100000);

                if (amountToWithdraw.compareTo(overdraftLimit.add(currentAccount.getBalance())) < 0){

                    System.out.println("You have exceeded your balance and overdraft limit.");

                }else{

                    

                }

            }



        } catch (Throwable throwable) {

            System.out.println(throwable.getMessage());

        }

    }
}
