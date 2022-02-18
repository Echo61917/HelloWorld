public class TestBankAccount {
    public static void main(String[] args){
        BankAccount bankaccount = new BankAccount (321123456, 5000.00, 5.5);
        System.out.println(bankaccount);
        System.out.println(bankaccount.getAccountNumber());
        System.out.println(bankaccount.getBalance());
        System.out.println(bankaccount.getAnnualInterestRate());
        System.out.println(bankaccount.getDate());

        bankaccount.deposit(20000.00);
        System.out.println(bankaccount.getBalance());
        bankaccount.withdraw(2500.00);
        System.out.println(bankaccount.getBalance());
    }

}
