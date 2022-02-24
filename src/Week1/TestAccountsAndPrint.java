package Week1;

public class TestAccountsAndPrint {
    public static void main(String[] args)
    {
        BankAccount bankaccount = new BankAccount (321123456, 5000.00, 5.5);
        CheckingsAccount checkingsaccount = new CheckingsAccount(213213, 2000.00, 10.0);
        SavingsAccount savingsAccount = new SavingsAccount(456789456,10000.00,20.5);

        BankAccount[] arrayOfAccounts = new BankAccount[3];

        arrayOfAccounts[0] = bankaccount;
        arrayOfAccounts[1] = checkingsaccount;
        arrayOfAccounts[2] = savingsAccount;

        for(BankAccount b : arrayOfAccounts)
        {
            System.out.println(b + "\n\n*********************************\n");
        }
        //System.out.println(bankaccount);
        //System.out.println(checkingsaccount);
    }
}
