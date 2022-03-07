package Week2;

public abstract class Employee
{
    protected String firstName;
    protected String lastName;
    protected long socialSecurityNumber;

    protected Employee(String firstName, String lastName, long socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //Declared
    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract long getSocialSecurityNumber();
    public abstract double earnings();

    @Override
    public String toString()
    {
        return "First Name: " + this.firstName + "\n" + "Last Name: " + this.lastName + "\n" + "Social Security Number: " + this.socialSecurityNumber;
    }
}