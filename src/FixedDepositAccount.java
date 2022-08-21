public class FixedDepositAccount extends BankAccount{
    private int periodOfDeposit;
    private float rateOfInterest;

    public FixedDepositAccount(String accountHolderName, long accountNumber, double accountBalance, boolean accountStatus,
                               int periodOfDeposit, float rateOfInterest) {
        super(accountHolderName, accountNumber, accountBalance, accountStatus);
        this.periodOfDeposit = periodOfDeposit;
        this.rateOfInterest = rateOfInterest;
    }

    public int getPeriodOfDeposit() {
        return periodOfDeposit;
    }

    public void setPeriodOfDeposit(int periodOfDeposit) {
        this.periodOfDeposit = periodOfDeposit;
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }
    @Override
    public double showAccountBalance(){

        return this.getAccountBalance();
    }
}
