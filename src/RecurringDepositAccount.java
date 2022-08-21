public class RecurringDepositAccount extends BankAccount{
    private double monthlyBalance;
    private static float ROI=5;

    public RecurringDepositAccount(String accountHolderName, long accountNumber, double accountBalance, boolean accountStatus,
                                   double monthlyBalance, float rateOfInterest) {
        super(accountHolderName, accountNumber, accountBalance, accountStatus);
        this.monthlyBalance = monthlyBalance;



    }

    public double getMonthlyBalance() {
        return monthlyBalance;
    }

    public void setMonthlyBalance(double monthlyBalance) {
        this.monthlyBalance = monthlyBalance;
    }

    @Override
    public double showAccountBalance(){

        return this.getAccountBalance();
    }
    public double monthlyInterest(){
        return monthlyBalance*ROI/100;
    }
}
