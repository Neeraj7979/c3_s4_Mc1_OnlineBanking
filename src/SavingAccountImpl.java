import java.util.Scanner;

public class SavingAccountImpl extends SavingsAccount{
    public SavingAccountImpl(String accountHolderName, long accountNumber, double accountBalance, boolean accountStatus) {
        super(accountHolderName, accountNumber, accountBalance, accountStatus);
    }

    public static void main(String[] args) {
      SavingsAccount s1= new SavingsAccount("Neeraj kumar",SavingsAccount.accountNumber(),
              5678903,true);
        Scanner sc=new Scanner(System.in);
        System.out.println("Customer Details : ");
        System.out.println("--------------------------------");
        System.out.println("Customer Name : "+ s1.getAccountHolderName());
        System.out.println("Customer Account Number : "+ s1.getAccountNumber());
        System.out.println("Current Balance : "+ s1.showAccountBalance());
        System.out.println("Account Status : "+ s1.accountStatus());
        System.out.println("Enter the amount to credit from account");
        double amountCredit=sc.nextDouble();
        s1.credit(amountCredit);
        System.out.println("Enter the amount to credit from account");
        double amountDebit=sc.nextDouble();
        s1.credit(amountDebit);


    }
}
