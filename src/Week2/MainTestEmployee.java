package Week2;

public class MainTestEmployee {
    public static void main(String[] args)
    {
        SalariedEmployee SEmployee = new SalariedEmployee("Veronica", "Huston", 456789123L, 3000.0);
        HourlyEmployee HEmployee = new HourlyEmployee("Tom", "Thompson", 123654789L, 17.30, 40 );
        CommissionEmployee CEmployee = new CommissionEmployee("Quanchi", "Kempo", 654789321L, 25000.0, 10.0);

        System.out.println(SEmployee.getWeekSalary());
        System.out.println(SEmployee.getFirstName());
        System.out.println(SEmployee.getLastName());
        System.out.println(SEmployee.getSocialSecurityNumber());
        System.out.println(SEmployee.earnings());
        SEmployee.setWeekSalary(2500);

        System.out.println(HEmployee.getFirstName());
        System.out.println(HEmployee.getLastName());
        System.out.println(HEmployee.getSocialSecurityNumber());
        System.out.println(HEmployee.getWage());
        System.out.println(HEmployee.getHours());
        HEmployee.setWage(17.30);
        HEmployee.setHours(45);
        System.out.println(HEmployee.earnings());

        System.out.println(CEmployee.getFirstName());
        System.out.println(CEmployee.getLastName());
        System.out.println(CEmployee.getSocialSecurityNumber());
        System.out.println(CEmployee.getGrossSales());
        System.out.println(CEmployee.getCommissionRate());
        CEmployee.setGrossSales(30000.00);
        CEmployee.setCommissionRate(15.0);
        System.out.println(CEmployee.earnings());

        Employee [] arrayOfEmployees = {SEmployee, HEmployee, CEmployee};

        for(Employee e : arrayOfEmployees){
            System.out.println( e );
        }





        SEmployee.earnings();
        HEmployee.earnings();
        CEmployee.earnings();


    }
}
