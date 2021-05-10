package bankapp;

import java.util.UUID;

public class Transaction {
    private UUID id;
    private  Float amount;
    private String month;
    private String year;
    private TransactionType transactionType;

    public Transaction( Float amount, String month, String year, TransactionType transactionType) {
        this.id = UUID.randomUUID();
        this.amount = amount;
        this.month = month;
        this.year = year;
        this.transactionType = transactionType;
    }

    public UUID getId() {
        return id;
    }

    public Float getAmount() {
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
