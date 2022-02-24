package Week1;

import java.util.GregorianCalendar;

public class SavingsAccount extends BankAccount {

    //Constructor
    public SavingsAccount (long aN, double b, double aIR)
    {
        super(aN, b, aIR);
    }
    //getAccruedInterest
   public double getAccruedInterest()
    {
        GregorianCalendar today = new GregorianCalendar();
        int yearsSpanned = today.get(GregorianCalendar.YEAR) - dateCreated.get(GregorianCalendar.YEAR);
        return this.balance*this.annualInterestRate*yearsSpanned;
    }

    //getBalance (overrides inherited method)
    @Override
    public double getBalance(){
        return this.balance + getAccruedInterest();
    }
}
