package com.megabankcorp.records;

import java.math.BigDecimal;

public class Account {
    private BigDecimal currentSum; // поле для текущей суммы на счете
    private long currentAccount; // поле для текущего номера счета
    private long bankIdClient; // поле для номера клиента банка

    public Account(BigDecimal currentSum, long currentAccount, long bankIdClient) {
        // констркуктор с копиями переменных
        this.currentSum = currentSum;
        this.currentAccount = currentAccount;
        this.bankIdClient = bankIdClient;
    }
    public BigDecimal getCurrentSum() {  // геттер для получения значения переменной
        return currentSum;
    }
    public void setCurrentSum(BigDecimal currentSum) { // устанавливаем новое значение переменной
        this.currentSum = currentSum;
    }
    public long getCurrentAccount() { // устанавливаем новое значение переменной
        return currentAccount;
    }
    public void setCurrentAccount(long currentAccount) {  // устанавливаем новое значение переменной
        this.currentAccount = currentAccount;
    }
    public long getBankIdClient() {  // устанавливаем новое значение переменной
        return bankIdClient;
    }
    public void setBankIdClient(long bankIdClient) { // устанавливаем новое значение переменной
        this.bankIdClient = bankIdClient;
    }
}
