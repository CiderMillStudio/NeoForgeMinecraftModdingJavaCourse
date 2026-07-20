package net;

/*
 * EXERCISE 4:
 * Bank Management System:
 * Create a Bank Management System which has the following components:
 * Person (which saves first, middle and last name, age and maybe a "social security number")
 * Bank (which saves a List of customers and their Checking Accounts, maximum overdraw amount)
 * Checking Account (should have a current value, methods for taking and depositing money)
 * Opening a Checking Account should only work via a Bank and must require a certain amount of initial deposit.
 *
 *
 */

import net.wady.Bank;
import net.wady.Person;

public class Main {


    public static void main(String[] args) {
        Bank bank = new Bank(100);

        Person wady = new Person("Wady", "Thomas", "Jacoby", "12/03/1998", "123-45-6789");
        Person moosya = new Person("Moosya", "D", "Jacoby", "12/08/1998", "987-65-4321");

        bank.addPerson(wady);

        bank.openNewCheckingAccount(wady, "Wady Checking", 20);

        bank.openNewCheckingAccount(moosya, "moosya checking", 34);






        //bank.listBankAccountHolders();

        //bank.listPersonsAccounts(wady);
        //bank.listPersonsAccounts(moosya);


        bank.makeDeposit(wady, "wady checking", 25);
        bank.makeWithdrawal(wady, "wady ChEcking", 10);

        //bank.listPersonsAccounts(wady);

        bank.openNewCheckingAccount(moosya, "moosya checking 2", 24);

        bank.makeWithdrawal(moosya, "moosya checking 2", 104);



    }
}
