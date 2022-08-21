public abstract class BankAccount {
    private String accountHolderName;
    private long accountNumber;
    private double accountBalance;
    private boolean accountStatus;

    public BankAccount(String accountHolderName, long accountNumber, double accountBalance, boolean accountStatus) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountStatus = accountStatus;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public abstract double showAccountBalance();
    public double credit(double creditAmount ){
        accountBalance= getAccountBalance()-creditAmount;
        System.out.println("Your account is credited by"+creditAmount+"The available balance is"+accountBalance);
    return accountBalance;

    }
    public double debit(double debitAmount ){
        System.out.println("Your account is credited by"+debitAmount+"The available balance is"+accountBalance);
        return accountBalance;

    }

}

