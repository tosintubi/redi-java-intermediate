package bankapp;

public class MainClass {
    public static void main(String[] args) {
        Account tosinAccount = new Account("Tosin ");
        tosinAccount.addTransaction(new Transaction(28F,"Jan", "2021", TransactionType.INCOME));
        tosinAccount.addTransaction(new Transaction(50F,"Feb", "2021", TransactionType.INCOME));
        tosinAccount.addTransaction(new Transaction(-45F,"March", "2021", TransactionType.TRANSPORT));
        tosinAccount.addTransaction(new Transaction(-11.70F,"May", "2021", TransactionType.ENTERTAINMENT));

        Transaction maxTx = tosinAccount.maxExpense();
        System.out.println("The biggest payment is:"+ maxTx.getId() + " ["+ maxTx.getAmount() +"$, "+ maxTx.getTransactionType() + ", "+ maxTx.getYear()+ ","+ maxTx.getMonth()+"]");
    }
}
