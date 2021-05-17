package bankapp;

public class MainClass {
    public static void main(String[] args) {
        Account someAccount = new Account("John Doe");
        someAccount.addTransaction(new Transaction(25.00,"Dec", "2020", TransactionType.INCOME));
        someAccount.addTransaction(new Transaction(28.00,"Jan", "2021", TransactionType.INCOME));
        someAccount.addTransaction(new Transaction(50.00,"Feb", "2021", TransactionType.INCOME));
        someAccount.addTransaction(new Transaction(-45.93,"March", "2020", TransactionType.TRANSPORT));
        someAccount.addTransaction(new Transaction(11.70,"May", "2021", TransactionType.INCOME));
        someAccount.addTransaction(new Transaction(-11.70,"May", "2019", TransactionType.ENTERTAINMENT));
        someAccount.addTransaction(new Transaction(-4.70,"Jan", "2021", TransactionType.ENTERTAINMENT));
        someAccount.addTransaction(new Transaction(-2.72,"May", "2020", TransactionType.ENTERTAINMENT));
        someAccount.addTransaction(new Transaction(190.06,"May", "2021", TransactionType.INCOME));

        Transaction maxTx = someAccount.maxExpense();
        System.out.println("The biggest payment is:"+ maxTx.getId() + " [ "+ maxTx.getAmount() +"$, "+ maxTx.getTransactionType() + ", "+ maxTx.getYear()+ ","+ maxTx.getMonth()+"]");

        System.out.println("========================");
        System.out.println("The total income is: "+someAccount.totalIncome()+"$");


    }
}
