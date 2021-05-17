package bankapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
        Double maxValue = 0D;
        for (Transaction transaction: this.transactions) {
            if ((maxValue > transaction.getAmount() && transaction.getTransactionType() != TransactionType.INCOME )){
                maxValue = transaction.getAmount();
                maxTransaction = transaction;
            }
        }
        return  maxTransaction;
    }

    public Float totalIncome(){
        float total = 0F;
        for (Transaction transaction: this.transactions) {
            if (transaction.getTransactionType() == TransactionType.INCOME ){
               total+=transaction.getAmount();
            }
        }
        return total;
    }
    public void paymentGroupedByType(List<Transaction> transactionList){
        System.out.println("How do you spend your money: ");

        Set<TransactionType> types = new TreeSet<>();
        for (Transaction paymentTransaction : transactionList){
            types.add(paymentTransaction.getTransactionType());
        }
        for (TransactionType type: types){
            paymentsTotalPerType(transactionList, type);
        }
    }

    private void paymentsTotalPerType(List<Transaction> payments,
                                             TransactionType type) {
        double totalSum = 0;
        for (Transaction payment: payments) {
            if (payment.getTransactionType() == type) {
                totalSum = totalSum + payment.getAmount();
            }
        }
        System.out.println(type + ": " + totalSum);
    }
}
