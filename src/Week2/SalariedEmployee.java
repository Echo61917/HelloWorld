package Week2;

public class SalariedEmployee extends Employee
{
    //Additional Attribute
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, long socialSecurityNumber, double weeklySalary)
    {
        super(firstName,lastName,socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    //Get
    public double getWeekSalary() {return this.weeklySalary;}
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public long getSocialSecurityNumber(){return this.socialSecurityNumber;}
    //Set
    public void setWeekSalary(double weeklySalary) {this.weeklySalary = weeklySalary;}

    //earnings
    @Override
    public double earnings() {return this.weeklySalary;}
}