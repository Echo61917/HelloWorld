package Week2;

public class CommissionEmployee extends Employee
{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, long socialSecurityNumber,double grossSales, double commissionRate)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    //Getter
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public long getSocialSecurityNumber(){return this.socialSecurityNumber;}
    public double getGrossSales(){return this.grossSales;}
    public double getCommissionRate(){return this.commissionRate;}
    //Setter
    public void setGrossSales(double grossSales){this.grossSales = grossSales;}
    public void setCommissionRate(double commissionRate){this.commissionRate = commissionRate/100;}
    //Override
    @Override
    public double earnings(){return grossSales*commissionRate;}
}
