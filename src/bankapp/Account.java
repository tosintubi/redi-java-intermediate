package bankapp;

import java.util.ArrayList;

public class Account {
    private String accountHolder;
    private ArrayList<Transaction> transactions;

    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
        this.transactions = new ArrayList<>();
    }

    public int addTransaction(Transaction transaction){
        transactions.add(transaction);
        return transactions.size();
    }
}
