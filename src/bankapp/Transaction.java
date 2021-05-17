package bankapp;

import java.util.UUID;

public class Transaction {
    private UUID id;
    private  Double amount;
    private String month;
    private String year;
    private TransactionType transactionType;

    public Transaction( Double amount, String month, String year, TransactionType transactionType) {
        this.id = UUID.randomUUID();
        this.amount = amount;
        this.month = month;
        this.year = year;
        this.transactionType = transactionType;
    }

    public UUID getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }
}
