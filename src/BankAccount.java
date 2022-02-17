import java.util.GregorianCalendar;

public class BankAccount {
        //Data fields (instance & static variables)
        protected long accountNumber;
        protected double balance;
        protected double annualInterestRate;
        protected GregorianCalendar dateCreated;

        //Constructor (executed when new BankAccount is created)
        public BankAccount(long aN, double b, double aIR)
        {
                this.accountNumber = aN;
                this.balance = b;
                this.annualInterestRate = aIR;
                dateCreated = new GregorianCalendar();
        }

        //Mutator/setter methods (used to modify private data fields
        /* 
           deposit
           withdraw
         */
        // deposit  would be:
        //balance = balance + moneyGoingIn;
        public double deposit(double amount){
                if(amount < 0){
                         this.balance += amount;
                }
                return this.balance;
        }
        //withdraw would be:
        // balance = balance - moneyGoingOut;
        public double withdraw (double amount) {
                if(amount <= balance) {
                        this.balance -= amount;
                }
                return this.balance;
        }


        //Accessor/getter methods (used to access value of private data fields)
        /*
           getAccountNumber
           getBalance
           getInterestRate
           getDate
         */
        public long getAccountNumber() {return this.accountNumber;}
        public double getBalance() {return this.balance;}
        public double getAnnualInterestRate() {return this.annualInterestRate;}
        public String getDate() {return dateCreated.getTime().toString();}

        //public GregorianCalendar getDateCreated() {return this.dateCreated;}
        //Possible solutions for getDate
        //public String getDate() {return date.toString();}
        //public String getDate() {return date.getTime();}
        //public String getDate() {return date.getTime().toString();}

        //toString method (returned when BankAccount object is referenced)
        //
        //toString
        //Notes that should be printed:
        //account number
        //balance
        //annual interest rate?
        //date created
        @Override
        public String toString(){
                return "Account: " + this.accountNumber + "\n" +
                        "Balance: " + this.balance + "\n" +
                        "Annual Interest Rate: " + this.annualInterestRate + "\n" +
                        "Date Created: " + getDate();
        }
}
