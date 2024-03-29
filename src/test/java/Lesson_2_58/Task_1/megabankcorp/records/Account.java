package Lesson_2_58.Task_1.megabankcorp.records;

import java.math.BigDecimal;

public class Account {
    private final BigDecimal balance; // поле для текущей суммы на счете
    private final long currentAccount; // поле для текущего номера счета
    private final long idClient; // поле для номера клиента банка

    public long getIdClient() {  // получаем номер клиента банка
        return idClient;
    }

    public BigDecimal getBalance() { // получаем баланс на счете клиента банка
        return balance;
    }


    public long getCurrentAccount() { // получаем текущий номер счета клиента банка
        return currentAccount;
    }

    public Account(BigDecimal balance, long currentAccount, long idClient) {
        this.balance = balance;
        this.currentAccount = currentAccount;
        this.idClient = idClient;
    }

}
