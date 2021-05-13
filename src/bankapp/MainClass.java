package bankapp;

public class MainClass {
    public static void main(String[] args) {
        Account someAccount = new Account("John Doe");
        someAccount.addTransaction(new Transaction(250F,"Dec", "2020", TransactionType.INCOME));
        someAccount.addTransaction(new Transaction(28F,"Jan", "2021", TransactionType.INCOME));
        someAccount.addTransaction(new Transaction(50F,"Feb", "2021", TransactionType.INCOME));
        someAccount.addTransaction(new Transaction(-45F,"March", "2020", TransactionType.TRANSPORT));
        someAccount.addTransaction(new Transaction(-11.70F,"May", "2021", TransactionType.ENTERTAINMENT));
        someAccount.addTransaction(new Transaction(-11.70F,"May", "2019", TransactionType.ENTERTAINMENT));
        someAccount.addTransaction(new Transaction(-4.70F,"Jan", "2021", TransactionType.ENTERTAINMENT));
        someAccount.addTransaction(new Transaction(-2.70F,"May", "2020", TransactionType.ENTERTAINMENT));
        someAccount.addTransaction(new Transaction(90F,"May", "2021", TransactionType.INCOME));

        Transaction maxTx = someAccount.maxExpense();
        System.out.println("The biggest payment is:"+ maxTx.getId() + " ["+ maxTx.getAmount() +"$, "+ maxTx.getTransactionType() + ", "+ maxTx.getYear()+ ","+ maxTx.getMonth()+"]");

        System.out.println("========================");
        System.out.println("The total income is: "+someAccount.totalIncome()+"$");
    }
}
