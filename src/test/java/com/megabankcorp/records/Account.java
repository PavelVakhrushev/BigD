package com.megabankcorp.records;

import com.megabankcorp.system.Database;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance; // поле для текущей суммы на счете
    private long currentAccount; // поле для текущего номера счета
    private long idClient; // поле для номера клиента банка

    public long getIdClient() {  // получаем номер клиента банка
        return idClient;
    }

    public BigDecimal getBalance() {
        return balance;
    }


    public long getCurrentAccount() {
        return currentAccount;
    }

}
