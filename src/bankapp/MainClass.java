package bankapp;

public class MainClass {
    public static void main(String[] args) {
        Account tosinAccount = new Account("John Doe");
        tosinAccount.addTransaction(new Transaction(250F,"Dec", "2020", TransactionType.INCOME));
        tosinAccount.addTransaction(new Transaction(28F,"Jan", "2021", TransactionType.INCOME));
        tosinAccount.addTransaction(new Transaction(50F,"Feb", "2021", TransactionType.INCOME));
        tosinAccount.addTransaction(new Transaction(-45F,"March", "2021", TransactionType.TRANSPORT));
        tosinAccount.addTransaction(new Transaction(-11.70F,"May", "2021", TransactionType.ENTERTAINMENT));
        tosinAccount.addTransaction(new Transaction(-11.70F,"May", "2021", TransactionType.ENTERTAINMENT));
        tosinAccount.addTransaction(new Transaction(-4.70F,"Jan", "2021", TransactionType.ENTERTAINMENT));
        tosinAccount.addTransaction(new Transaction(-2.70F,"May", "2020", TransactionType.ENTERTAINMENT));
        tosinAccount.addTransaction(new Transaction(90F,"May", "2021", TransactionType.INCOME));

        Transaction maxTx = tosinAccount.maxExpense();
        System.out.println("The biggest payment is:"+ maxTx.getId() + " ["+ maxTx.getAmount() +"$, "+ maxTx.getTransactionType() + ", "+ maxTx.getYear()+ ","+ maxTx.getMonth()+"]");

        System.out.println("========================");
        System.out.println("The total income is: "+tosinAccount.totalIncome()+"$");
    }
}
