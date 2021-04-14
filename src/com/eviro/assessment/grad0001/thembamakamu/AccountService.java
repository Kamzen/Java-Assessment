package com.eviro.assessment.grad0001.thembamakamu;

import java.math.BigDecimal;

public interface AccountService {

    //Interface for thw withdraw method, no access modifier stated because interface methods are public
    //by default.
    void withdraw(String accountNum, BigDecimal amountToWithdraw);

}
