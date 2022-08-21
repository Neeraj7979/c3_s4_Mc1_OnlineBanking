import java.util.Random;

public class SavingsAccount extends BankAccount {
    private static final float ROI=2.56f;

    public SavingsAccount(String accountHolderName, long accountNumber, double accountBalance, boolean accountStatus) {
        super(accountHolderName, accountNumber, accountBalance, accountStatus);
    }

    @Override
    public double showAccountBalance(){

        return this.getAccountBalance();
    }

    public boolean accountStatus(){
        if (getAccountBalance()>500){
            return true;
        }
        else {
            return false;
        }
    }
    public double yearlyInterest(){
        return (getAccountBalance()*ROI)/100;
    }


    public static long accountNumber() {
        Random random=new Random();
        return random.nextLong(99999999999L,10000000000000L);
    }


}
