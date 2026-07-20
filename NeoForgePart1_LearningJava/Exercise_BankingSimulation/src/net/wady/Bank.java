package net.wady;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Bank (which saves a List of customers and their Checking Accounts, maximum overdraw amount)

public class Bank {

    private final int maxOverdrawAmount;

    private HashMap<Person, List<CheckingAccount>> personAccountDirectory = new HashMap<>();


    public Bank(int maxOverdrawAmount) {
        this.maxOverdrawAmount = maxOverdrawAmount;
    }

    public void addPerson(Person person) {
        List<CheckingAccount> emptyAccountList = new ArrayList<>();
        personAccountDirectory.put(person, emptyAccountList);
    }


    public void addPerson(Person person, CheckingAccount... accounts) {
        List<CheckingAccount> newAccounts = new ArrayList<>();

        for (CheckingAccount account : accounts) {
            newAccounts.add(account);
        }

        personAccountDirectory.put(person, newAccounts);
    }

    public void openNewCheckingAccount(Person person, String accountName, int initialBalance){

        CheckingAccount newAccount = new CheckingAccount(person, accountName, initialBalance);

        for (Person existingPerson : personAccountDirectory.keySet()) {
            if (person.getFullName().equalsIgnoreCase(existingPerson.getFullName()))
            {
                personAccountDirectory.get(existingPerson).add(newAccount);
                System.out.println("CREATED NEW ACCOUNT FOR " + existingPerson.getFullName().toUpperCase()+ ". LISTING ALL ACCOUNTS:");
                listPersonsAccounts(existingPerson);
                return;
            }
        }

        // if a new person needs to be added via "addPerson", we can do that here instead:
        addPerson(person, newAccount);

    }


    public void makeDeposit(Person customer, String accountName, int depositAmount){
        for (Person person : personAccountDirectory.keySet()) {
            if (person.getFullName().equalsIgnoreCase(customer.getFullName())) {
                System.out.println("Found " + person.getFirstName() + "'s portfolio, searching for account...");

                for (CheckingAccount account : personAccountDirectory.get(person)) {
                    if (accountName.equalsIgnoreCase(account.getAccountName())) {
                        account.deposit(depositAmount);
                        return;
                    }
                }
                System.out.println("Could not find account: " + accountName);
            }
        }
    }

    public void makeWithdrawal(Person customer, String accountName, int withdrawalAmount) {
        for (Person person : personAccountDirectory.keySet()) {
            if (person.getFullName().equalsIgnoreCase(customer.getFullName())) {
                System.out.println("Found " + person.getFirstName() + "'s portfolio, searching for account...");

                for (CheckingAccount account : personAccountDirectory.get(person)) {
                    if (accountName.equalsIgnoreCase(account.getAccountName())) {
                        account.withdraw(withdrawalAmount, maxOverdrawAmount);
                        return;
                    }
                }
                System.out.println("Could not find account: " + accountName);
            }
        }
    }

    public void listPersonsAccounts(Person person) {
        for (Person existingPerson : personAccountDirectory.keySet()) {
            if (existingPerson.getFullName().equalsIgnoreCase(person.getFullName())) {
                int accountCount = 1;
                System.out.println("-----" + existingPerson.getFirstName().toUpperCase() + "'s ACCOUNTS--------");
                for (CheckingAccount account : personAccountDirectory.get(existingPerson)) {
                    System.out.println("~~ACCOUNT NO. " + accountCount + "~~");
                    System.out.println("Account Name: " + account.getAccountName());
                    System.out.println("Account Balance: " + account.getCurrentBalance());
                    accountCount++;
                }
            }
        }
    }

    public void listBankAccountHolders() {
        for (Person person : personAccountDirectory.keySet()) {
            System.out.println("--------------------------------------\nName: " + person.getFullName()
                    + "\nDate Of Birth: " + person.getDateOfBirth()
                    + "\nNumber of Accounts: " + personAccountDirectory.get(person).size()
                    + "\nLast 4 of SSN: " + person.getSocialSecurityNum().substring(5,9));
        }

        System.out.println("\nEND OF ACCOUNT HOLDER LIST");
    }

    public HashMap<Person, List<CheckingAccount>> getPersonAccountDirectory() {
        return personAccountDirectory;
    }







}
