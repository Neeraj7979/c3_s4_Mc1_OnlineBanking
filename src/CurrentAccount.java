public class CurrentAccount extends BankAccount{
    private double annualMaintenanceCharges;

    public CurrentAccount(String accountHolderName, long accountNumber, double accountBalance, boolean accountStatus,
                          double annualMaintenanceCharges) {
        super(accountHolderName, accountNumber, accountBalance, accountStatus);
        this.annualMaintenanceCharges = annualMaintenanceCharges;
    }

    public double getAnnualMaintenanceCharges() {
        return annualMaintenanceCharges;
    }

    public void setAnnualMaintenanceCharges(double annualMaintenanceCharges) {
        this.annualMaintenanceCharges = annualMaintenanceCharges;
    }
    @Override
    public double showAccountBalance(){

        return this.getAccountBalance();
    }
}
