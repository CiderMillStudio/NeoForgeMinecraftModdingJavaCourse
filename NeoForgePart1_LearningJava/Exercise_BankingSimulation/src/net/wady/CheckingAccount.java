package net.wady;

// Checking Account (should have a current value, methods for taking and depositing money)

public class CheckingAccount {

    private final String accountName;
    private final Person accountOwner;
    private int currentBalance;

    public CheckingAccount(Person accountOwner, String accountName, int currentBalance) {
        this.accountOwner = accountOwner;
        this.accountName = accountName;
        this.currentBalance = currentBalance;
    }

    public void deposit(int depositAmount) {
        currentBalance += depositAmount;
        System.out.println("Deposited $" + depositAmount + " into " + accountOwner.getFirstName() + "'s account: " + this.getAccountName()
                + ". Balance is now: $" + this.getCurrentBalance());
    }

    public void withdraw(int withdrawAmount, int maxWithdrawOverdraft) {
        if (withdrawAmount > currentBalance + maxWithdrawOverdraft) {
            System.out.println("ERROR: CANNOT WITHDRAW MORE THAN CURRENT BALANCE");
        }
        else {
            currentBalance -= withdrawAmount;
            System.out.println("Withdrew $" + withdrawAmount + " from " + accountOwner.getFirstName() + "'s account: " + this.getAccountName()
                    + ". Balance is now: $" + this.getCurrentBalance());
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }








}
