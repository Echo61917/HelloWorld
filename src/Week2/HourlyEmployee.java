package Week2;

public class HourlyEmployee extends Employee
{
    private double wage;
    private int hours;

    public HourlyEmployee(String firstName, String lastName, long socialSecurityNumber, double wage, int hours)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    //Getter
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public long getSocialSecurityNumber(){return this.socialSecurityNumber;}
    public double getWage(){return this.wage;}
    public int getHours(){return this.hours;}

    //Setter
    public void setWage(double wage){this.wage = wage;}
    public void setHours(int hours){this.hours = hours;}

    //Override Earnings
    @Override
    public double earnings(){return hours*wage;}

}