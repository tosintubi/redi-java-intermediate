package bankapp;

import java.util.ArrayList;

public class Account {
    private final String accountHolder;
    private ArrayList<Transaction> transactions;

    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
        this.transactions = new ArrayList<>();
    }

    public int addTransaction(Transaction transaction){
        transactions.add(transaction);
        return transactions.size();
    }

    public Transaction maxExpense(){
        Transaction maxTransaction = null;
        float maxValue = 0F;
        for (Transaction transaction: this.transactions) {
            if ((maxValue > transaction.getAmount() && transaction.getTransactionType() != TransactionType.INCOME )){
                maxValue = transaction.getAmount();
                maxTransaction = transaction;
            }
        }
        return  maxTransaction;
    }
}
