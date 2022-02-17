
public class CheckingsAccount extends BankAccount{
    public CheckingsAccount(long aN, double b, double aIR)
    {
        super(aN, b, aIR);
    }

    //withdraw (overrides inherited method)
    //The withdraw method has an overdraft limit in this class. An overdraft limit is an amount of money
    //that can be withdrawn past your current balance. For example, if you currently have $2000, and the overdraft
    //limit is $500, then you could withdraw $2500 from your account.

    //private final double overdraftLimit= 500.0;
    //@Override
    //public withdraw

}
